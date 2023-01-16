package selenium_study_questions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Day06 extends TestBase{

    @Test
    public void test01() throws InterruptedException {
        //Given kullanici "https://editor.datatables.net/" sayfasina gider
        driver.get("https://editor.datatables.net/");

        //    Then new butonuna basar
        driver.findElement(By.xpath("//*[@class='dt-button buttons-create']")).click();


        //    And editor firstname kutusuna "<firstName>" bilgileri girer
        //    And editor lastname kutusuna "<lastName>" bilgileri girer
        //    And editor position kutusuna "<position>" bilgileri girer
        //    And editor office kutusuna "<office>" bilgileri girer
        //    And editor extension kutusuna "<extension>" bilgileri girer
        //    And editor startdate kutusuna "<startDate>" bilgileri girer
        //    And editor salary kutusuna "<salary>" bilgileri girer

        driver.findElement(By.xpath("//*[@id='DTE_Field_first_name']")).sendKeys("ALEXX",Keys.TAB,
                "DE SOUZAA",Keys.TAB,"OCM",Keys.TAB,"FB",Keys.TAB,"ABC",Keys.TAB,"2023-01-01",Keys.TAB,"2000000");
        Thread.sleep(2500);

        //    When Create tusuna basar
        driver.findElement(By.xpath("//*[text()='Create']")).click();

        //    Then Kullanıcının eklendiğini doğrular.
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("ALEXX");
        String alexMi = driver.findElement(By.xpath("//table[@id='example']//tbody/tr//td[2]")).getText();
        Assert.assertEquals(alexMi,"ALEXX DE SOUZAA");


        //    And Eklediği kullanıcı kaydını siler
        driver.findElement(By.xpath("//table[@id='example']//tbody/tr//td[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='dt-button buttons-selected buttons-remove']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();
        Thread.sleep(2000);

        //    Then Kullanıcinin silindiğini doğrular.
        String text01 = driver.findElement(By.xpath("//*[@class='dataTables_empty']")).getText();
        String expectedtext = "No matching records found";
        Assert.assertEquals(text01,expectedtext);

    }

}