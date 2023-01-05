package Practice;
//3.1.2023
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class P09 extends TestBase {

@Test
    public void test() throws InterruptedException {

    //    go to url :http://demo.automationtesting.in/Alerts.html
    driver.get("http://demo.automationtesting.in/Alerts.html");


    //    click  "Alert with OK" and click 'click the button to display an alert box:'
    WebElement alert = driver.findElement(By.xpath("//*[@onclick='alertbox()']"));
alert.click();
    System.out.println(driver.switchTo().alert().getText()); // Alert üzerindeki yazıyı konsola yazdırdık
    driver.switchTo().alert().accept();//Alertte tamam'a bastık.
    //    accept Alert(I am an alert box!) and print alert on console


    //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();

    //    cancel Alert  (Press a Button !)
    Thread.sleep(2000);
    driver.switchTo().alert().dismiss();


    //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
    //    and then sendKeys 'TechProEducation' (Please enter your name)
driver.findElement(By.xpath("//*[text()='Alert with Textbox '] ")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
Thread.sleep(2000);
driver.switchTo().alert().sendKeys("TechproEducation");
Thread.sleep(2000);
driver.switchTo().alert().accept();

    //    finally print on console this message "Hello TechproEducation How are you today"
    System.out.println(driver.findElement(By.xpath("//*[@id='demo1']")).getText());


    //    aseertion these message
    Assert.assertEquals("Hello TechproEducation How are you today" ,
            driver.findElement(By.xpath("//*[@id='demo1']")).getText() );


}


}