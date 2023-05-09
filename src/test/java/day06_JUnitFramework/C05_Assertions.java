package day06_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Assertions {

    // 1) Bir class oluşturun: BestBuyAssertions
    // 2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
    //       ○ Sayfa URL’inin https://www.bestbuy.com/ ’a esit oldugunu test edin
    //       ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //       ○ logoTest => BestBuy logosunun görüntülendigini test edin
    //       ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    WebDriver driver;

    public void mahserin4Atlisi(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com");

    }
    @Test
    public void test01(){

        // ○ Sayfa URL’inin https://www.bestbuy.com/ ’a esit oldugunu test edin

        mahserin4Atlisi();

        String expectedUrl="https://www.bestbuy.com/";
        String actualUrl= driver.getCurrentUrl(); // https://www.bestbuy.com/
        Assert.assertEquals(expectedUrl,actualUrl);

        driver.close();

    }

    @Test
    public void test02(){

        mahserin4Atlisi();

        // ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin

        String expectedIcerik= "Rest";
        String actualTitle=driver.getTitle();  // Best Buy International: Select your Country - Best Buy


        Assert.assertFalse(actualTitle.contains(expectedIcerik));
        driver.close();
    }

    @Test
    public void test03(){

        mahserin4Atlisi();

        // ○ logoTest => BestBuy logosunun görüntülendigini test edin

        WebElement logoElementi = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/img"));
        logoElementi.isDisplayed();

        Assert.assertTrue(logoElementi.isDisplayed());
        driver.close();
    }

    @Test
    public void test04(){

        mahserin4Atlisi();

        // ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

        WebElement fransizcaLinkElementi = driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]/button"));

        Assert.assertTrue(fransizcaLinkElementi.isDisplayed());
        driver.close();


    }
}
