package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    /*
       TestNg test methodlarini isim sirasina gore calistirir
       priority degeri verilen method'lar  priority degeri kucukten buyuge dogru calisir
       esit olan priority degerlerinde harf sirasina bakar
       eger priority deegeri yazmazsak priority=0 kabul edilir
     */

    @Test(priority = 6)
    public void ilkTest(){
        System.out.println("Ilk Test Calisti");

    }

    @Test
    public void ikinciTest(){
        System.out.println("ikinci Test Calisti");

    }

    @Test(priority = -9)
    public void ucuncuTest(){
        System.out.println("ucuncu Test Calisti");

    }
}
