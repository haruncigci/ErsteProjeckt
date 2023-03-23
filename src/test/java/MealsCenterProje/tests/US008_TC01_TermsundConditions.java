package MealsCenterProje.tests;

import MealsCenterProje.pages.MealsCenterLoginpage;
import MealsCenterProje.utilities.ConfigurationReader;
import MealsCenterProje.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class US008_TC01_TermsundConditions {
    @Test
    public void TermsundConditionsTest(){
        MealsCenterLoginpage mealsCenterpage=new MealsCenterLoginpage();

        //"https://qa.mealscenter.com/ " sitesine git
        Driver.getDriver().get(ConfigurationReader.getProperty("mealsUrl"));
        //Asagi in ve Terms und Conditions butonuna Tikla
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView();",mealsCenterpage.TermsundConditions);

        jse.executeScript("arguments[0].click();",mealsCenterpage.TermsundConditions);

        //Terms und Conditions sayfasinin görüldügünü Dogrula
        mealsCenterpage.TermsundConditionsgörüldü.isDisplayed();

        //Sayfayi Kapat
        Driver.closeDriver();



    }
}
