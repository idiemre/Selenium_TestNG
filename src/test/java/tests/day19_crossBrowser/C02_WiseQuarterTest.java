package tests.day19_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;
import utilities.TestBaseRapor;

public class C02_WiseQuarterTest extends TestBaseCross {

    @Test
    public void test01(){
        // wisequarter anasayfaya gidelim
        driver.get("https://www.wisequarter.com");

        // wisequarter sayfasina gittigimizi test edelim
        String acualUrl= driver.getCurrentUrl();
        String expectedUrl="wisequarter";

        Assert.assertTrue(acualUrl.contains(expectedUrl));


    }

}
