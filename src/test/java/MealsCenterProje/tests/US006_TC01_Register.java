package MealsCenterProje.tests;

import MealsCenterProje.pages.MealsCenterpage;
import MealsCenterProje.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class US006_TC01_Register {

    @Test
    public void Register(){
        MealsCenterpage mealsCenterpage=new MealsCenterpage();

        //"https://qa.mealscenter.com/"  sitesine git
        Driver.getDriver().get("https://qa.mealscenter.com/");

        // ve Ana Ekrandan Sign in Butonuna Tikla
        mealsCenterpage.anaEkranSignInButonu.click();

        //Cookiesi Kabul Et
        mealsCenterpage.AcceptKabulButonu.click();



        //Login sayfasindan ("https://qa.mealscenter.com/account/login")  Sign up Butonuna tikla
        mealsCenterpage.SignUpButonu.click();

        //Register yazisinin altindaki First Name Last Name Email Adress Telefon Numarasi Password ve Password Tekrarla Butonlarini Doldur
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

        actions.sendKeys(mealsCenterpage.FristnameKutusu)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("ahmet12.")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("ahmet12.")

                //Sign up Butonuna tikla
                .sendKeys(Keys.ENTER).perform();

        //sayfayi kapat
        Driver.closeDriver();


    }


}
