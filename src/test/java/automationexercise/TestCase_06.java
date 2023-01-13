package automationexercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase_06 extends TestBase {

    @Test
    public void test06(){

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePageLogo = driver.findElement(By.xpath("//*[@src='/static/images/home/logo.png']"));
        System.out.println("Anasayfa Gorunuyor mu? = " + homePageLogo.isDisplayed());

        //4. Click on 'Contact Us' button
        WebElement contactUsButtom = driver.findElement(By.xpath("//*[@href='/contact_us']"));
        contactUsButtom.click();


        //5. Verify 'GET IN TOUCH' is visible
        WebElement getInTouch = driver.findElement(By.xpath("(//*[@class='title text-center'])[2]"));
        System.out.println("getInTouch.isDisplayed() = " + getInTouch.isDisplayed());

        //6. Enter name, email, subject and message  //8. Click 'Submit' button  //7. Upload file ()
        WebElement name = driver.findElement(By.xpath("//*[@data-qa='name']"));
        name.sendKeys("Hasan", Keys.TAB,
                "hashuseyincoskun@gmail.com",Keys.TAB,"Test Upload file problemi hk",Keys.TAB,
                "Henuz ogrenmedigimiz icin upload file islemi yapamadik");

        //driver.navigate().refresh();
        //9. Click OK button
        driver.findElement(By.xpath("//*[@data-qa='submit-button']")).click();
        driver.switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        WebElement resultText = driver.findElement(By.xpath("//*[@class='status alert alert-success']"));
        System.out.println("resultText.isDisplayed() = " + resultText.isDisplayed());

        //11. Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("//*[@class='fa fa-angle-double-left']")).click();

    }











}