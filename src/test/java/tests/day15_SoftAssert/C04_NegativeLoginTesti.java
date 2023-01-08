package tests.day15_SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C04_NegativeLoginTesti {
    // 3 test methodu olusturun
    // 1. de yanlis emaili dogru sifre
    // 2. de dogru email yanlis sifre
    // 3. de yanlis email yanlis sifre ile giris yapilamadigini test edin
    QualitydemyPage qualitydemyPage=new QualitydemyPage();

    @Test
    public void yanlisEmailTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("mehmet@abc.com");
        qualitydemyPage.passwordKutusu.sendKeys("31488081");
        qualitydemyPage.loginButonu.submit();

        Assert.assertFalse(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisSifreTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("user_1106147@login.com");
        qualitydemyPage.passwordKutusu.sendKeys("3148808fd1");
        qualitydemyPage.loginButonu.submit();

        Assert.assertFalse(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
        Driver.closeDriver();
    }


    @Test
    public void yanlisEmailSifreTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("mehmet@abc.com");
        qualitydemyPage.passwordKutusu.sendKeys("314880slfshl81");
        qualitydemyPage.loginButonu.click();

        Assert.assertFalse(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
        Driver.closeDriver();
    }





}
