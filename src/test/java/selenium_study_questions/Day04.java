package selenium_study_questions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day04 extends TestBase {
static String urun;

@Test

   public void test() throws InterruptedException {

//1. "https://www.saucedemo.com" Adresine gidin
   driver.get("https://www.saucedemo.com");

//2. Username kutusuna "standard_user" yazdirin
   Thread.sleep(1500);
driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");


//3. Password kutusuna "secret_sauce" yazdirin
   Thread.sleep(1500);
driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");


//4. Login tusuna basin
   driver.findElement(By.xpath("//*[@id='login-button']")).click();
   System.out.println(urun );


//5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
   String urun =driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).getText();
   driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).click();
   System.out.println(urun );

//6. Add to Cart butonuna basin
driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();

//7. Alisveris sepetine tiklayin
driver.findElement(By.xpath("//*[@class='shopping_cart_badge']")).click();

//8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
   Thread.sleep(1500);
String urun1=driver.findElement(By.xpath("//*[@class='inventory_item_name']")).getText();


   Assert.assertEquals(urun1,urun);


//9. Sayfayi kapatin
   Thread.sleep(1500);
driver.close();


}
}
