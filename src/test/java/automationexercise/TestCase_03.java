package automationexercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase_03 extends TestBase {

    @Test
    public void test01(){

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//3.3. Verify that home page is visible successfully
        WebElement home = driver.findElement(By.xpath("//*[@src='/static/images/home/logo.png']"));
        System.out.println("home.isDisplayed() = " + home.isDisplayed());

        //4.Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();

        //5.Verify 'Login to your account' is visible
        WebElement loginIsVisible = driver.findElement(By.xpath("//*[text()='Login to your account']"));
        System.out.println("loginIsVisible.isDisplayed() = " + loginIsVisible.isDisplayed());

        //6.Enter incorrect email address and password
        WebElement emailAdress = driver.findElement(By.xpath("//*[@data-qa='login-email']"));
        emailAdress.sendKeys("abc@gmail.com", Keys.TAB,"12345");
//7. Click 'login' button
        driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
//8. Verify error 'Your email or password is incorrect!' is visible
        WebElement text = driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']"));
        System.out.println("text.isDisplayed() = " + text.isDisplayed());




    }

}
