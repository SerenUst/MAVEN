package selenium_study_questions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.testBase;

public class Day03 extends testBase {

    @Test
    public void test01() throws InterruptedException {
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        Thread.sleep(1500);


        //2. Signin buttonuna tiklayin
        driver.findElement(By.cssSelector("[id='signin_button']")).click();
        Thread.sleep(1500);

        //3. Login alanine  "username" yazdirin
        driver.findElement(By.cssSelector("[id='user_login']")).sendKeys("username");
        Thread.sleep(1500);

        //4. Password alanine "password" yazdirin
        driver.findElement(By.cssSelector("[id='user_password']")).sendKeys("password");
        Thread.sleep(1500);

        //5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
        driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);

        //6. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.cssSelector("[id='onlineBankingMenu']")).click();
        driver.findElement(By.cssSelector("[id='pay_bills_link']")).click();

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.cssSelector("[id='sp_amount']")).sendKeys("2");

        //8. tarih kismina "2020-09-10" yazdirin
        driver.findElement(By.cssSelector("[id='sp_date']")).sendKeys("2023-1-10");

        //9. Pay buttonuna tiklayin
        driver.findElement(By.cssSelector("[id='pay_saved_payees']")).click();

        //10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
        String actualText = driver.findElement(By.cssSelector("[id='alert_content']")).getText();
        String expectedText = "The payment was successfully submitted.";

        Assert.assertEquals(actualText,expectedText);

    }

}