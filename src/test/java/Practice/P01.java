package Practice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {


//-"sahibinden.com" adresine gidelim
//-bu web adresinin sayfa basligini(title) ve adres(url)ini yazdıralım
//-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
//-Ardindan "trendyol.com" adresine gidelim
//-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini kontrol edelim
//-Bi onceki web sayfamiza geri donelim
//-sayfayi yenileyelim
//-Daha sonra trendyol sayfamiza tekrar donelim ve sayfayi kapatalim


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



//-"amazon.com" adresine gidelim
        driver.get("https://amazon.com");


//-bu web adresinin sayfa basligini(title) ve adres(url)ini yazdıralım
        String actualTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();
        System.out.println("sayfa başlıgı : " + actualTitle);
        System.out.println("sayfa url'si : " + actualUrl);


//-title ve url'nin "spend" kelimesinin icerip icermedigini kontrol edelim
        Assert.assertFalse(actualTitle.contains("spend") || actualUrl.contains("spend"));

//-Ardindan "trendyol.com" adresine gidelim
        driver.get("https://trendyol.com");


//-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini kontrol edelim
        String trendyolTitle = driver.getTitle();
        Assert.assertTrue(trendyolTitle.contains("Sitesi"));


//-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();

//-sayfayi yenileyelim
        driver.navigate().refresh();


//-Daha sonra trendyol sayfamiza tekrar donelim ve sayfayi kapatalim
        driver.navigate().forward();
        driver.quit();//Birden fazla sayfada calışılmış ise quit() methodu kullanılır.


    }


}