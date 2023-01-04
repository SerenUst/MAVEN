package day_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class TestBase {
    //abstract yapma sebebimiz: bu class ın objesini oluşturmak istemem.
    //TestBase testBase = new TestBase()--->YAPILAMAZ
    //Amacım içindeki hazır methodları kullanmak olduğu için abstract yaptık

    //driver objesini oluştur. Driver public ya da protected olmalı. Sebep: child class lardan çağrılabilmesi.
    protected static WebDriver driver;

    //setUp method oluşturuyorum
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    //tearDown
  //  @After
   // public void tearDown(){
    //    driver.quit();
    }



//