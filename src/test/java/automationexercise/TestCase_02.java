package automationexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase_02 {
    //hashuseyincoskun@gmail.com
    //1234abc.
    static WebDriver driver;
    @BeforeClass
    public static void  setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01(){
        //1. Launch browser
        //2.Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement logo = driver.findElement(By.xpath("//*[@src='/static/images/home/logo.png']"));
        System.out.println("logo.isDisplayed() = " + logo.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();

        //5. Verify 'Login to your account' is visible
        WebElement loginText = driver.findElement(By.xpath("//*[text()='Login to your account']"));
        System.out.println("loginText.isDisplayed() = " + loginText.isDisplayed());

        //6. Enter correct email address and password
        WebElement email = driver.findElement(By.xpath("(//*[@name='email'])[1]"));
        email.sendKeys("hashuseyincoskun@gmail.com",Keys.TAB,"1234abc.");

        //7. Click 'login' button
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();

        //8. Verify that 'Logged in as username' is visible
        WebElement userName = driver.findElement(By.xpath("//*[@class='fa fa-user']"));
        System.out.println("userName.isDisplayed() = " + userName.isDisplayed());

        //9. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();

        driver.navigate().refresh();




    }
}