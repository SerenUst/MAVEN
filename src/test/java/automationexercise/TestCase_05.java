package automationexercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.testBase;

public class TestCase_05 extends testBase {


    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//*[@src='/static/images/home/logo.png']"));
        System.out.println("homePage.isDisplayed() = " + homePage.isDisplayed());
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        //5. Verify 'New User Signup!' is visible
        WebElement newUserIsVisible = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        System.out.println("newUserIsVisible.isDisplayed() = " + newUserIsVisible.isDisplayed());
        //6. Enter name and already registered email address
        //7. Click 'Signup' button
        WebElement email = driver.findElement(By.xpath("//*[@data-qa='signup-name']"));
        email.sendKeys("alex de souza", Keys.TAB, "msercanustfdm@gmail.com", Keys.TAB, Keys.ENTER);
        //8. Verify error 'Email Address already exist!' is visible
        WebElement alreadyExistIsVisible = driver.findElement(By.xpath("//*[text()='Email Address already exist!']"));
        System.out.println("alreadyExistIsVisible.isDisplayed() = " + alreadyExistIsVisible.isDisplayed());
    }
}