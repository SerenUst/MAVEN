package selenium_study_questions;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
import static org.junit.Assert.assertTrue;
    public class day12 extends TestBase {
        @Test
        public void test12() throws InterruptedException {
            //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
            driver.get("http://webdriveruniversity.com/Actions");

            Thread.sleep(5000);
            //2. "Hover over Me First" kutusunun ustune gelin
            Actions actions = new Actions(driver);
            actions.
                    moveToElement(driver.findElement(By.xpath("//button[.='Hover Over Me First!']"))).
                    perform();
            Thread.sleep(5000);

            //3. "Link 1" e tiklayin
            actions.
                    click(driver.findElement(By.linkText("Link 1"))).
                    perform();

            Thread.sleep(5000);


            //4. Popup mesajini yazdirin
          //  System.out.println("MESSAGE: " + driver.switchTo().alert().getText());

            System.out.println("message :   " + driver.switchTo().alert().getText());
            //Thread.sleep(5000);

            //5. Popup'i tamam diyerek kapatin
//            driver.switchTo().alert().accept();
driver.switchTo().alert().accept();
  //          Thread.sleep(5000);

            //6. "Click and hold" kutusuna basili tutun
    //        WebElement box = driver.findElement(By.id("click-box"));
      //      actions.clickAndHold(box).perform();

            Thread.sleep(5000);
WebElement kutu = driver.findElement(By.id("click-box"));
actions.clickAndHold(kutu).perform();
Thread.sleep(5000);
            //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        //    System.out.println(box.getText());

            System.out.println(kutu.getText());

            //8. "Double click me" butonunu cift tiklayin
            actions.
                    doubleClick(driver.findElement(By.id("double-click"))).perform();
            Thread.sleep(5000);
          //  actions.
            //        doubleClick(driver.findElement(By.id("double-click"))).
              //      perform();

            //9. "Double click me" butonunun renk değiştridiğini doğrulayın
            assertTrue(driver.findElement(By.xpath("//div[@class='div-double-click double']")).isEnabled());
            assertTrue(driver.findElement(By.xpath("//div[@class='div-double-click double']")).isEnabled());
        }
    }


