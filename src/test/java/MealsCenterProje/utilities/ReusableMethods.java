package MealsCenterProje.utilities;

public class ReusableMethods {
    //Sürekli Kullanilan methodlari buraya yerlestiririz
        public static void sleep(int sayi){
            try {
                Thread.sleep(sayi);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}
