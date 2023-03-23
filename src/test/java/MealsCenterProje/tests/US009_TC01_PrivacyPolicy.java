package MealsCenterProje.tests;

import MealsCenterProje.pages.MealsCenterpage;
import MealsCenterProje.utilities.ConfigurationReader;
import MealsCenterProje.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US009_TC01_PrivacyPolicy {
    @Test
    public void PrivacyPolicyTest(){
        MealsCenterpage mealsCenterpage=new MealsCenterpage();


        //"https://qa.mealscenter.com/"  sitesine git
        Driver.getDriver().get(ConfigurationReader.getProperty("mealsUrl"));
        //Ana sayfanin en alt kisminda Privacy policy Butonuna tikla
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",mealsCenterpage.Privacy_Policiy );
        jse.executeScript("arguments[0].click();",mealsCenterpage.Privacy_Policiy);
        //Privacy policy ekranin acildigini dogru

        Assert.assertTrue(mealsCenterpage.PrivacyPolicyGöründü.isDisplayed());

        //sayfayi Kapat
        Driver.closeDriver();





    }
}
