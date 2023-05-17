package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class WebTable extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        // 1."https://www.amazon.com" adresine gidin

        driver.get("https://www.amazon.com");

        //2.Sayfanin en altina inin

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END);

        //3.Web table tum body’sini yazdirin

        WebElement tableBodyElementi=driver.findElement(By.xpath("(//div[@role='navigation'])[2]"));
        System.out.println(tableBodyElementi.getText());

        //4.Web table’daki satir sayisinin 9 oldugunu test edin

       List<WebElement> tableList=driver.findElements(By.xpath("//table/tbody/tr"));

        int expectedIcerik=9;
        int actualSonuc=tableList.size();

        Assert.assertEquals(expectedIcerik,actualSonuc);

        //5.Tum satirlari yazdirin

        for (WebElement eachRow:tableList
             ) {
            System.out.println(eachRow.getText());
        }

        //6. Web table’daki sutun sayisinin 13 olduğunu test edin

        List<WebElement> sutunElementi=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
        expectedIcerik=13;
        actualSonuc=sutunElementi.size();

        Assert.assertEquals(expectedIcerik,actualSonuc);

        //7. 5.sutunu yazdirin


        //8.Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi
        //döndüren bir method olusturun
    }
}
