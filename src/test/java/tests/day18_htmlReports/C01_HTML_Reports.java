package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.security.Key;

public class C01_HTML_Reports extends TestBaseRapor {

    @Test
    public void test01() throws InterruptedException {

        extentTest=extentReports.createTest("Nutella testi","kullanici amazonda nutella arayabilmeli");

        // amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon anasayfaya gidildi");
        // nutella aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        extentTest.info("Arama kutusuna nutella yazip arama yapildi");
        // sonuclarin nutella icerdigini test edelim
        String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        String expectedSonucYazisi="Nutella";
        extentTest.info("Arama sonuclari kaydedildi");
        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
        extentTest.pass("Arama sonuclarinin Nutella icerdigi test edildi");

    }
}
