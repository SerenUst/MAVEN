package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.testBase;

import java.util.List;

public class Dropdown extends testBase {


@Test
    public  void test01(){
    //Amazon sayfasına gidelim
    driver.get("https://amazon.com");

    //Dropdown menuyu yazdıralım
    List<WebElement> dropdown = driver.findElements(By.xpath("//*[@id='searchDropdownBox']"));
     //Select select = new Select(dropdown);
    dropdown.forEach(t-> System.out.println(t.getText()));

    //Dropdown menuden baby secelim
    driver.findElement(By.xpath("//*[@id='searchDropdownBox']")).sendKeys("Baby"
            , Keys.TAB,"Milk",Keys.ENTER);
    //arama bölümünden milk aratalım


}
}
