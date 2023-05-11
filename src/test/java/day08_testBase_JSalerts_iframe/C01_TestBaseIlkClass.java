package day08_testBase_JSalerts_iframe;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_TestBaseIlkClass extends TestBase {

    @Test
    public void test01(){

        // amazon'a gidelim

        driver.get("https://www.amazon.com");

        // Nutella icin arama yapalım

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // arama sonuclarinin Nutella icerdigini test edelim








    }

}
