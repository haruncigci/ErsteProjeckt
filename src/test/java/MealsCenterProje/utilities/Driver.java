package MealsCenterProje.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    // test islemini baslatabilmek icin driver classi olustururuz.
    // Tarayici calisabilmesi icin driver classinin icinde olustururuz.
    // Cesitli driverlari burda olsutururuz ve ihtiyacimiz olani yazariz

    // Driver da hafizada direk yer alacak olan bir classtir. Bunun icin static bir driver olustur

    static WebDriver driver;

    // ister static blokla ister methodla cagirabiliriz

    public static WebDriver getDriver(){

        ChromeOptions ops=new ChromeOptions();
        String browser=ConfigurationReader.getProperty("browser");

        if (driver==null){
            //properties dosyasinin icerisindeki "browser" anahtarinin
            //degerini getirecek >>>> chrome
            switch (browser){
                case "chrome":
                    ops.addArguments("--remote-allow-origins=*");
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(ops);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver=new SafariDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                default:
                    ops.addArguments("--remote-allow-origins=*");
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(ops);
                    break;
            }

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
    public static void closeDriver(){
        if (driver !=null){
            driver.quit();
            driver=null;

        }
    }
    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }





}
