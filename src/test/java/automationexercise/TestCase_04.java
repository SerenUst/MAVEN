package automationexercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase_04 extends TestBase {

    @Test
    public void case04Test(){

//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//        3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//*[@lang='en']"));
        // //*[@src='/static/images/home/logo.png']
        System.out.println("Logo gorunur mu ? " + homePage.isDisplayed());

//        4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();

//        5. Verify 'Login to your account' is visible
        WebElement loginText = driver.findElement(By.xpath("(//h2)[1]"));
        System.out.println("loginText.isDisplayed() = " + loginText.isDisplayed());

//        6. Enter correct email address and password,  7. Click 'login' button (Keys.ENTER ile giris)
        WebElement emailLocate = driver.findElement(By.xpath("(//*[@type='email'])[1]"));
        emailLocate.sendKeys("msercanustfdm@gmail.com", Keys.TAB,"abcd1234", Keys.ENTER);

//        8. Verify that 'Logged in as username' is visible
        WebElement loggedConsole = driver.findElement(By.xpath("//*[@class='fa fa-user']"));
        System.out.println("loggedConsole.isDisplayed() = " + loggedConsole.isDisplayed());

//        9. Click 'Logout' button
        WebElement logOutButtom = driver.findElement(By.xpath("//*[@href='/logout']"));
        logOutButtom.click();

//        10. Verify that user isd t navigateo login page
        WebElement homePage1 = driver.findElement(By.xpath("//*[@lang='en']"));
        System.out.println("homePage1.isDisplayed() = " + homePage1.isDisplayed());

    }

}