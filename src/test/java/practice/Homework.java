package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseBeforeClass;

import java.util.List;

public class Homework extends TestBaseBeforeClass {


    @Test
    public void test01(){
        //Test01 :
        //1- amazon gidin

        driver.get("https://www.amazon.com");

        //2- Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement dropdownMenuElementi=driver.findElement(By.xpath("//select[@title='Search in']"));
        Select select=new Select(dropdownMenuElementi);

        List<WebElement> dropdownListesi=select.getOptions();

        for (WebElement eachDropdown:dropdownListesi
             ) {
            System.out.println(eachDropdown.getText());
        }


        //3- dropdown menude 40 eleman olduğunu doğrulayın

        int expectedIcerik=40;
        int actualDropdownSize=dropdownListesi.size();

        Assert.assertEquals(expectedIcerik,actualDropdownSize);


    }

    @Test
    public void test02() throws InterruptedException {

        WebElement dropdownMenuElementi=driver.findElement(By.xpath("//select[@title='Search in']"));
        Select select=new Select(dropdownMenuElementi);

        //Test02
        //1- dropdown menuden elektronik bölümü seçin


        select.selectByVisibleText("Electronics");

        //2- arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın

        WebElement searchBoxKutusuElementi=driver.findElement(By.id("twotabsearchtextbox"));
        searchBoxKutusuElementi.sendKeys("iphone" + Keys.ENTER);
        Thread.sleep(3000);

        //3- sonuc sayisi bildiren yazinin iphone icerdigini test edin

        WebElement sonucYazisi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedIcerik="iphone";
        String actualSonuc=sonucYazisi.getText();

        Assert.assertTrue(actualSonuc.contains(expectedIcerik));

        //4- ikinci ürüne relative locater kullanarak tıklayin


        //5- ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim

    }

    @Test
    public void test03() throws InterruptedException {

        //Test03
        //1- yeni bir sekme açarak amazon anasayfaya gidin

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");

        //2-dropdown’dan bebek bölümüne secin

        WebElement dropdownMenuElementi=driver.findElement(By.xpath("//select[@title='Search in']"));
        Select select=new Select(dropdownMenuElementi);
        select.selectByVisibleText("Baby");

        //3-bebek puset aratıp bulundan sonuç sayısını yazdırın

        WebElement searchBoxKutusuElementi=driver.findElement(By.id("twotabsearchtextbox"));
        searchBoxKutusuElementi.sendKeys("bebek puseti" + Keys.ENTER);
        Thread.sleep(3000);

        String sonucSayisiYazisi=driver.findElement(By.xpath("//span[text()='2 results for']")).getText();
        String[] sonucArr=sonucSayisiYazisi.split("");
        System.out.println(sonucArr[0]);

        //4-sonuç yazsının puset içerdiğini test edin


        //5-üçüncü ürüne relative locater kullanarak tıklayin
        //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin

    }




    //Test 4
    //1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın
}
