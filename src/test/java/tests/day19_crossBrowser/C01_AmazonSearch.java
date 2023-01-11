package tests.day19_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;
import utilities.TestBaseRapor;

import java.security.Key;

public class C01_AmazonSearch extends TestBaseCross {

    @Test
    public void test01(){
        // amazona gidelim
        driver.get(ConfigReader.getProperty("amazonUrl"));
        // nutella aratalim
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // sonuclarin nutella icerdigini test edelim

        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualSonucYazisi= sonucYaziElementi.getText();
        String expectedSonucYazisi="Nutella";

        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
    }


}
