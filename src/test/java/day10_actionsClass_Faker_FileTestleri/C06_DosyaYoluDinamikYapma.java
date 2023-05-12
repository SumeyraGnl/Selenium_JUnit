package day10_actionsClass_Faker_FileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_DosyaYoluDinamikYapma {

    @Test
    public void test01(){


        System.out.println(System.getProperty("user.dir")); // /Users/sumeyragunel/IdeaProjects/com.Team113JUnit

        System.out.println(System.getProperty("user.home")); // /Users/sumeyragunel

      /*

      biz Downloads'a indirdigim dosyanin dosya yolunu 2'ye bolecegiz
            /Users/ahmetbulutluoz               /Downloads/foto.png
            herkesin bilgisayarinda farkli      herkeste ayni
            System.getProperty("user.home")     /Downloads/foto.png

       */

        String dosyaYoluDegisenKisim = System.getProperty("user.home");
        String dosyaYoluherkesteAyniOlanKisim = "/Downloads/foto.png";

        String dosyaYolu= dosyaYoluDegisenKisim + dosyaYoluherkesteAyniOlanKisim;

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        // ayni islemi projemizin altindaki deneme.txt icin yapsak

        dosyaYoluDegisenKisim = System.getProperty("user.dir");
        dosyaYoluherkesteAyniOlanKisim = "/src/test/java/day10_actionsClass_Faker_FileTestleri/deneme.txt";

        dosyaYolu = dosyaYoluDegisenKisim + dosyaYoluherkesteAyniOlanKisim;

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }
}
