package MealsCenterProje.pages;

import MealsCenterProje.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MealsCenterpage {
            public MealsCenterpage(){
                PageFactory.initElements(Driver.getDriver(),this);
            }

            @FindBy(xpath = "//*[text()='Sign in']")
            public WebElement anaEkranSignInButonu;

            @FindBy(xpath = "//*[text()='Accept']")
            public WebElement AcceptKabulButonu;

            @FindBy(xpath = "//input[@id='username']")
            public WebElement EmailorTelefonButonu;

            @FindBy (xpath = "//*[text()='Sign Up']")
            public WebElement SignUpButonu;

            @FindBy (xpath = "//input[@id=\"firstname\"]")
            public WebElement FristnameKutusu;

            @FindBy(xpath = "//*[text()='Contact us']")
            public WebElement ContactUs;


            @FindBy (xpath = "//h2[@class='text-center mb-3']")
            public WebElement hungryyazisi;

            @FindBy (xpath = "//*[text()='Contact Us']")
            public WebElement ContactUSGöründü;

            @FindBy (xpath = "//*[text()='Terms and conditions']")
            public WebElement TermsundConditions;

            @FindBy (xpath = "(//*[text()='Terms and conditions'])[1]")
            public WebElement TermsundConditionsgörüldü;

            @FindBy(xpath = "//*[text()='Privacy policy']")
            public WebElement Privacy_Policiy;

            @FindBy(xpath = "(//*[text()='Privacy policy'])[1]")
            public WebElement PrivacyPolicyGöründü;








}
