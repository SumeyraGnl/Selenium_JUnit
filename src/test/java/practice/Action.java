package practice;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Action extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        // 1. "http://webdriveruniversity.com/Actions" sayfasina gidin

        driver.get("http://webdriveruniversity.com/Actions");

        //2. "Hover over Me First" kutusunun ustune gelin

        Actions actions=new Actions(driver);
        WebElement hoverElementi=driver.findElement(By.xpath("//div[@class='dropdown hover']"));
        actions.moveToElement(hoverElementi).perform();

        //3. "Link 1" e tiklayin
        WebElement linl1Elementi=driver.findElement(By.xpath("(//a[@class='list-alert'])[1]"));
        linl1Elementi.click();

        //4. Popup mesajini yazdirin

        String alert=driver.switchTo().alert().getText();
        System.out.println(alert);

        //5. Popup'i tamam diyerek kapatin

        driver.switchTo().alert().accept();

        //6. "Click and hold" kutusuna basili tutun

        WebElement clickElementi=driver.findElement(By.id("click-box"));
        actions.clickAndHold(clickElementi).perform();
        Thread.sleep(2000);

        //7. "Click and hold" kutusunda cikan yaziyi yazdirin

        System.out.println(clickElementi.getText());


        //8. "Double click me" butonunu cift tiklayin

        WebElement doubleClickElementi=driver.findElement(By.id("double-click"));

        actions.doubleClick(doubleClickElementi).perform();
        Thread.sleep(2000);
    }
}