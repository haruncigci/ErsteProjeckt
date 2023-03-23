package MealsCenterProje.tests;

import MealsCenterProje.pages.MealsCenterLoginpage;
import MealsCenterProje.utilities.Driver;
import MealsCenterProje.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class US007_TC01_ContactUs {
    @Test
    public void ContactUsTest(){
        MealsCenterLoginpage mealsCenterpage=new MealsCenterLoginpage();

        //- "https://qa.mealscenter.com/" sitesine gidilebilmeli
        Driver.getDriver().get("https://qa.mealscenter.com/");

        //Cookies i kabul et
        Actions actions=new Actions(Driver.getDriver());
        mealsCenterpage.AcceptKabulButonu.click();


        //Sayfada belirli bir ikona ulasmak icin kullanilan yöntem.

        //Mausun tekerini döndürmek icin scrollInto..
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",mealsCenterpage.ContactUs);

        ReusableMethods.sleep(3);




        //- Ana Sayfanin en altindaki Contact Us kismina gel ve tikla
        //mealsCenterpage.ContactUs.click();
        //belirlenen koda tiklamak icin
        jse.executeScript("arguments[0].click();",mealsCenterpage.ContactUs);

        //- Contact Us sayfasinin Görüldügünü dogrula
        String ContactUsUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(ContactUsUrl);

       mealsCenterpage.ContactUSGöründü.isDisplayed();   // ??

        //- sayfayi kapat
        Driver.getDriver().close();


    }
}
