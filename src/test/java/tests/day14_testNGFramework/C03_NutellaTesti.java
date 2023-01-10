package tests.day14_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_NutellaTesti {



    @Test(groups = "minireg1")
    public void test01(){
        // amazon anasayfaya gidin
        // nutella icin arama yapin
        // sonuclarin nutella oldugunu test edin

        Driver.getDriver().get("https://www.amazon.com/");

        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);

        String actualAramaSonucu=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        String expectedAramaSonucu="Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedAramaSonucu));

        Driver.closeDriver();



    }
}
