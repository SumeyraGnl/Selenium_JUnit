package day09_swichingWindow_actionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.time.LocalTime;

public class C03_ActionsClass extends TestBase {

    @Test
    public void test01(){
       /*
        //  x saniyelik bir sayac yapalim

        int x= 3;
        LocalTime baslangic=LocalTime.now();
        int basSaniye=baslangic.getSecond();
        int saniyeKontrol=123;

        int bitisSaniye= basSaniye

        */

        // 2- https://the-internet.herokuapp.com/context_menu sitesine gidin

        driver.get("https://the-internet.herokuapp.com/context_menu");

        //3- Cizili alan uzerinde sag click yapin

        WebElement ciziliAlan=driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);
        actions.contextClick(ciziliAlan).perform();

        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        //5- Tamam diyerek alert’i kapatalim
        //6- Elemental Selenium linkine tiklayalim
        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
    }
}
