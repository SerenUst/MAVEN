package automationexercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase_07 extends TestBase {

@Test
    public void text1(){

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    driver.get("http://automationexercise.com");


    //3. Verify that home page is visible successfully
    WebElement home = driver.findElement(By.xpath("(//*[@href='/'])[1]"));
    System.out.println("home.isDisplayed() = " + home.isDisplayed());


    //4. Click on 'Test Cases' button
driver.findElement(By.xpath("(//*[@class='btn btn-success'])[1]")).click();

    //5. Verify user is navigated to test cases page successfully

    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = "https://automationexercise.com/test_cases";
    Assert.assertFalse(actualUrl.contains(expectedUrl));


}
}
