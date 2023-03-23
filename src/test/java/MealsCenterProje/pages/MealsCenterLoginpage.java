package MealsCenterProje.pages;

import MealsCenterProje.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MealsCenterLoginpage {
            public MealsCenterLoginpage(){
                PageFactory.initElements(Driver.getDriver(),this);
            }


            //MealsCenter Sign in Butonu
            @FindBy(xpath = "//*[text()='Sign in']")
            public WebElement anaEkranSignInButonu;

            //Cookies i kabul etm
            @FindBy(xpath = "//*[text()='Accept']")
            public WebElement AcceptKabulButonu;

            //MealsCenter>Sign in ekranindaki Email kutusu
            @FindBy(xpath = "//input[@id='username']")
            public WebElement EmailorTelefonButonu;

            //Mealscenter>Sign in ekranindaki Sign Up butonu
            @FindBy (xpath = "//*[text()='Sign Up']")
            public WebElement SignUpButonu;

            //MealsCenter>Sign Up Kutularindaki ilkKutu(isim)
            @FindBy (xpath = "//input[@id=\"firstname\"]")
            public WebElement FristnameKutusu;

            //MealsCenter/Anasayfanin/contact Us Butonu
            @FindBy(xpath = "//*[text()='Contact us']")
            public WebElement ContactUs;


            @FindBy (xpath = "//h2[@class='text-center mb-3']")
            public WebElement hungryyazisi;

            //MealsCenter>Contact Us yazisi
            @FindBy (xpath = "//*[text()='Contact Us']")
            public WebElement ContactUSGöründü;

            //MealsCenter/TermsundConditionsButonu
            @FindBy (xpath = "//*[text()='Terms and conditions']")
            public WebElement TermsundConditions;

            //TermsundconditionsYazisi
            @FindBy (xpath = "(//*[text()='Terms and conditions'])[1]")
            public WebElement TermsundConditionsgörüldü;

            //MealsCenter/PrivacyPolicyButonu
            @FindBy(xpath = "//*[text()='Privacy policy']")
            public WebElement Privacy_Policiy;

            //MealsCenter>PrivacyPolicyYazisi
            @FindBy(xpath = "(//*[text()='Privacy policy'])[1]")
            public WebElement PrivacyPolicyGöründü;








}
