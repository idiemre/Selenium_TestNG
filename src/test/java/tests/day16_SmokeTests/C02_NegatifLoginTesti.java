package tests.day16_SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_NegatifLoginTesti {
    // 3 test methodu olusturun
    // 1. de yanlis emaili dogru sifre
    // 2. de dogru email yanlis sifre
    // 3. de yanlis email yanlis sifre ile giris yapilamadigini test edin

    QualitydemyPage qualitydemyPage=new QualitydemyPage();


    @Test
    public void yanlisEmailTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualitydemyPage.loginButonu.submit();
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());

        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }

    @Test
    public void yanlisPasswordTesti(){
        qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualitydemyPage.loginButonu.submit();
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());

        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }


    @Test
    public void yanlisEmailYanlisPasswordTesti(){
        qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualitydemyPage.loginButonu.submit();
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());

        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }
}
