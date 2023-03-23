package MealsCenterProje.utilities;

import org.openqa.selenium.JavascriptExecutor;

public class ReusableMethods {
    //Sürekli Kullanilan methodlari buraya yerlestiririz
        public static void sleep(int sayi){
            try {
                Thread.sleep(sayi);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



        //Maus Tekerleginin alinan locate veya Asagi dogru gitmesi icin ve
         // JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
         //jse.executeScript("arguments[0].scrollIntoView();",mealsCenterpage.TermsundConditions);

        //jse.executeScript("arguments[0].click();",mealsCenterpage.TermsundConditions);


}
