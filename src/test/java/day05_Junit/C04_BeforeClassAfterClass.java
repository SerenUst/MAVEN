package day05_Junit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C04_BeforeClassAfterClass {
    /*
  @BeforeClass ve @AfterClass notasyonları yalnızca static methodlar için çalışır.
  @BeforeClass ve @AfterClass kullanırsak oluşturduğumuz @Test methodlarının hepsini aynı anda çalıştırıp en son @AfterClass'ı çalıştırırız
  Ama sadece @Before ve @After kullanırsak her test için @Before ve @After i kullanır
     */
    @BeforeClass
    public static void setUp(){
        System.out.println("Tüm testlerden önce çalıştı");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("Tüm testlerden sonra çalıştı");
    }
    @Before
    public void setUp1(){
        System.out.println("Her testten önce çalışır");
    }
    @After
    public void tearDown2(){
        System.out.println("Her testten sonra çalışır");
    }
    @Test
    public void test01(){
        System.out.println("İlk Test");
    }
    @Test
    public void test02(){
        System.out.println("İkinci Test");
    }
    @Test
    @Ignore
    public void test03(){
        System.out.println("Üçüncü Test");
    }
}