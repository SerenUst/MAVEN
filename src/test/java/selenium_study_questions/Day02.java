package selenium_study_questions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day02 extends TestBase {

    @Test
    public void test01(){
        // 2 - https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");


        // 3 - Browseri tam sayfa yapin
        driver.manage().window().fullscreen();

        // 4 - Sayfayi "refresh" yapin
        driver.navigate().refresh();

        // 5 - "Salesforce Apex Questions Bank" icin arama yapiniz
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);


        // 6 - Kac sonuc bulundugunu yaziniz
        String resultText = driver.findElement(By.xpath("(//*[@class=\"a-section a-spacing-small a-spacing-top-small\"])[1]")).getText();
        String [] resultArray =  resultText.split(" ");
        System.out.println("Bulunan Sonuc Sayisi = " + Arrays.stream(resultArray).collect(Collectors.toList()).get(0));

        // 7 - Sayfayi kapatin
        driver.close();

    }

}
