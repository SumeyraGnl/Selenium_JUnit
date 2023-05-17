package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Ifreme extends TestBase {
    @Test
    public void test01(){

        // 1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin

        driver.get("http://webdriveruniversity.com/IFrame/index.html");

        //2. “Our Products” butonuna basin

        WebElement iframeElementi=driver.findElement(By.id("frame"));
        driver.switchTo().frame(iframeElementi);
        WebElement ourProducts=driver.findElement(By.xpath("//a[text()='Our Products']"));
        ourProducts.click();

        //3. “Cameras product”i tiklayin

        driver.findElement(By.xpath("(//div[@class='section-title'])[2]")).click();

        //4. Popup mesajini yazdirin

        WebElement popupElementi=driver.findElement(By.xpath("//div[@class='modal-body']"));
        System.out.println(popupElementi.getText());

        //5. “close” butonuna basin

        driver.findElement(By.xpath("//button[text()='Close']")).click();

        driver.switchTo().parentFrame();

        //6. "WebdriverUniversity.com (IFrame)" linkini tiklayin

        driver.findElement(By.xpath("(//a[@class='navbar-brand'])[1]")).click();

        //7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin

        String expectedURL= "http://webdriveruniversity.com/index.html";
        String actualURL=driver.getCurrentUrl();

        Assert.assertEquals(expectedURL,actualURL);


    }
}
