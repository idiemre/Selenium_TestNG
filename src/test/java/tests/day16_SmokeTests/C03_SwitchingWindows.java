package tests.day16_SmokeTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.dnd.DropTarget;

public class C03_SwitchingWindows {

    @Test
    public void test01(){

        // https://the-internet.herokuapp.com/iframe adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
        // elemental selenium linkine tiklayin
        Driver.getDriver().findElement(By.linkText("Elemental Selenium")).click();
        // title'i "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro"
        // olan yeni window'a gecis yapin
        ReusableMethods.switchToWindow("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro");
        // ve sayfa uzerinde h1 tag'inda "Elemental Selenium" yazisinin oldugunu test edin

        String expectedYazi="Elemental Selenium";
        String actualYazi=Driver.getDriver().findElement(By.tagName("h1")).getText();

        Assert.assertEquals(expectedYazi,actualYazi);

        Driver.getDriver().quit();


    }
}
