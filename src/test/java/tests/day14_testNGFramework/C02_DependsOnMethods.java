package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C02_DependsOnMethods {


    @Test
    public void ilkTest(){
        System.out.println("Ilk Test Calisti");

    }

    @Test(dependsOnMethods = "ilkTest")
    public void ikinciTest(){
        System.out.println("ikinci Test Calisti");

    }

    @Test(dependsOnMethods = "ikinciTest")
    public void ucuncuTest(){
        System.out.println("ucuncu Test Calisti");

    }
}
