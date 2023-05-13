package practice;

import org.junit.*;

public class P01 {

    /*
    @BeforeClass  // sadece 1 kere calisiyor
    @Before  // Her testten once 1 kere calisir
    @AfterClass  // Tum testlerden sonra 1 kere calisir
    @After  // Her testten sonra 1 kere calisir
    @Test  // Yapacagimiz test kodlarinin yer aldiği kisim

     */

    @Test
    public void test01(){
        System.out.println("Test 01");
    }

    @Test
    public void test02(){
        System.out.println("Test 02");
    }

    @Test
    public void test03(){
        System.out.println("Test 03");
    }


}
