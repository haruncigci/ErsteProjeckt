package MealsCenterProje.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
//>>>>>herhangi bir yerden bu classi cagirdigimizda burda yazilanlar ile istenilen yere ulasicaz.
    // herttürlü veriyi buraya girebiliriz ve burdan projeyi tek yerden kontrol etmek icin properties ile yönetiriz
    // propertiese de burdan ulasiriz
        static Properties properties; // heryerden cagirabilmek icin static yaptik


        static {
            String path ="configuration.properties";       // dosyanin okunmasi icin dosya yolu aciyoruz
            FileInputStream file = null;
            try {
                file = new FileInputStream(path);

                properties = new Properties();
                properties.load(file);
            }catch(IOException e){
                    e.printStackTrace();
                }


            }
            //
            public static String getProperty(String key){
            return properties.getProperty(key);

            }


}
