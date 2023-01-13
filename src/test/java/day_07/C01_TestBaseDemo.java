
package day_07;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class C01_TestBaseDemo extends TestBase {
        /*
        UTILITIES:
        - Tekrar tekrar kullanacağımız, classları koyduğumuz package nin adıdır.
               -TestBase
               -Driver ->Sonra
               -ExcelUtil ->Sonra
               -Configuration ->Sonra
        - Utilities package de test caseler yazılmaz.
        - Sadece Tekrar kullanılabilecek destek sınıfları(support class) oluşturulur.
        - Bu support classlar test caseslerinyazılmasını hızlandırır
         */

    @Test
    public void test01(){
        //techproeducation title 'Bootcamp' içeriyor mu?
        driver.get("https://www.techproeducation.com");
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Bootcamp"));

    }



}