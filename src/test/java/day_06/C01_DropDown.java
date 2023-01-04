package day06;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
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
public class C01_DropDown {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void selectByIndexTest(){
        //        Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
        //        Dogum yilini, ayini ve gununu su sekilde secer : 2000, January, 10
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        // 1.Adım: Locate Dropdown
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

        //2.Adım:Select obj oluştur
        Select yearDropdown = new Select(year);

        //3.Adım:Select obj kullanarak 3 farklı şekilde seçim(select) yapabilirim
        yearDropdown.selectByIndex(22);  //Seçenek Sırası---> 0 dan başlıyor.

        //Ay seçimi --- >
        WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
        Select monthDropdown = new Select(month);
        monthDropdown.selectByValue("0");  //Optionun value değeri ile seçim yapılabilir. Valuesi "0"

        //Gün seçimi - - - >

        WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
        Select dayDropdown = new Select(day);
        dayDropdown.selectByVisibleText("10");//text yazısı ne ise onu kabul eder
    }

    //Tüm eyalet isimlerini konsola yazdırınız
    @Test
    public void printAllTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement state = driver.findElement(By.xpath("//*[@id='state']"));
        Select stateDropdown = new Select(state);
        List<WebElement> stateList = stateDropdown.getOptions();
        for (WebElement w:stateList) {
            System.out.println(w.getText());
        }
    }



    /*
     1. What is dropdown? Dropdown nedir?
     Dropdown liste olusturmak icin kullanilir.

     2. How to handle dropdown elements? Dropdown nasil automate edilir?
     -dropdown i locate ederim
     -select objesi olustururum
     -select objesi ile istedigim secenegi secerim
     NOT: select objesi olusturma nedenim, dropdownlarin Select classi ile olusturulmasi


     3. Tum dropdown seceneklerini nasil print ederiz?
     - tum dropdown elementlerini getOptions() methodu ile listeye koyariz
     - sonra secenekleri loop ile yazdirabilirz
     4. Bir secenegin secili oldugunu otomate etmek icin ne yapilir?
     Ornek: Gun olarak 10 i secdik ama ya secilmediyse?
     getFirstSelectedOption() secili olan secenegi return eder
      */
    @Test
    public void getSelectedOptionsTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement state = driver.findElement(By.xpath("//*[@id='state']"));
        Select stateDropdown = new Select(state);
        //WebElement varsayilanElement = stateDropdown.getFirstSelectedOption();
        //String varsayilanElementText = varsayilanElement.getText();
        String varsayilanText = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Select a State",varsayilanText);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
