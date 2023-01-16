package selenium_study_questions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Day07 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //    //1-https://rahulshettyacademy.com/AutomationPractice/ adresine gidin
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //    //2-Dropdown Example menüsünün görünür olduğunu doğrulayın.
        WebElement menu = driver.findElement(By.xpath("//*[text()='Dropdown Example']"));
        Assert.assertTrue(menu.isDisplayed());

        //    //3-Option3 ü seçin.
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option3");

        Thread.sleep(2000);


        //    //4-Option3 ün seçili olduğunu doğrulayın.

        WebElement seciliMi = select.getFirstSelectedOption();
        Assert.assertTrue(seciliMi.isSelected());



    }
}