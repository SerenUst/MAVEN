package day06;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;
public class C03_Practice {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    //Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
    //Dogum yilini, ayini ve gununu su sekilde secer : 2000, January, 10
    @Test
    public void test01(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
        Select yearDropdown = new Select(year);
        yearDropdown.selectByVisibleText("2000");
        WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
        Select monthDropDown = new Select(month);
        monthDropDown.selectByVisibleText("January");
        WebElement day = driver.findElement(By.id("day"));
        Select dayDropdown = new Select(day);
        dayDropdown.selectByVisibleText("10");
    }
    //Tüm eyalet isimlerini konsola yazdırınız
    @Test
    public void test02(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement stateName = driver.findElement(By.xpath("//*[@id='state']"));
        Select stateDropdown = new Select(stateName);
        List<WebElement>stateList=stateDropdown.getOptions();
        for (WebElement w:stateList) {
            System.out.println(w.getText());
        }
    }
    //Select a State seçili mi?
    @Test
    public void test03(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement stateName = driver.findElement(By.xpath("//*[@id='state']"));
        Select stateDropdown = new Select(stateName);
        String isStateSelected = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Select a State",isStateSelected);
    }
}