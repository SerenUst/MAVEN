package day_17;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_JSExecutor_Type extends TestBase {
    /*
    typeTest metotu olustur
    Techpro education ana sayfasina git
     */
    @Test
    public void typeTest(){
//       Techpro education ana sayfasina git
        driver.get("https://www.techproeducation.com");
        waitFor(3);
//        Arama kutusuna QA yaz
        typeWithJS(driver.findElement(By.xpath("//input[@type='search']")),"QA");
    }

    private void typeWithJS(WebElement element, String qa) {
    }
}