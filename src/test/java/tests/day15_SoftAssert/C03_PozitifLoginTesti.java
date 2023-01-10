package tests.day15_SoftAssert;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_PozitifLoginTesti {


    @Test(groups = "smoke")
    public void test01(){
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");

        //2- login linkine basin

        qualitydemyPage.ilkLoginLinki.click();
        //3- Kullanici email'i olarak valid email girin
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("user_1106147@login.com");
        //4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys("31488081");

        //5- Login butonuna basarak login olun
        qualitydemyPage.loginButonu.submit();

        //6- Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());


        Driver.closeDriver();
    }
}
