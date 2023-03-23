package MealsCenterProje.tests;

import MealsCenterProje.pages.MealsCenterpage;
import MealsCenterProje.utilities.ConfigurationReader;
import MealsCenterProje.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


//Driver.getDriver bizim tarayicimizdir diyebiliriz
public class US005_TC01_Login {
    @Test
    public void loginTesti(){


        MealsCenterpage mealsCenterpage=new MealsCenterpage();

        //"https://qa.mealscenter.com/" internet Sitesine Git ve Sign in butonuna Tikla
       // Driver.getDriver().get("https://qa.mealscenter.com/");

        Driver.getDriver().get(ConfigurationReader.getProperty("mealsUrl"));
        mealsCenterpage.anaEkranSignInButonu.click();

        // Cookies i Kabul et..
        mealsCenterpage.AcceptKabulButonu.click();

         //ReusableMethods.sleep(3000);


        //Login Yazisinin Altindaki  Kutucuklari tikla ve Istenilen Bilgileri Doldur
        Actions actions=new Actions(Driver.getDriver());
        actions.click(mealsCenterpage.EmailorTelefonButonu)
                .sendKeys("kenansessiz@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("harun19.")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //Anasayfanin sag üstünde adini Dogrula ve sayfayi kapat
        Driver.closeDriver();
    }
}






//WebElement SignIn=Driver.getDriver().findElement(By.xpath("//*[text()='Sign in']"));
//SignIn.click();
// WebElement accept=Driver.getDriver().findElement(By.xpath("//*[text()='Accept']"));
//accept.click();
// mealsCenterpage.EmailorTelefonButonu.click();
//WebElement EmailorTelefon=Driver.getDriver().findElement(By.xpath("//input[@id='username']"));
//EmailorTelefon.sendKeys("kenansessiz@gmail.com");
//WebElement passwort=Driver.getDriver().findElement(By.xpath("(//label[@class='required'])[2]"));
//passwort.sendKeys("harun19.");
// WebElement SinInTikla=Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-green w-100']"));
// SinInTikla.click();