package testcases;

import commons.BaseTest;
import objects.HomePageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testdata.DataTests;
import testdata.DataURLs;

public class TC_01_Tim_Chuyen_Bay extends BaseTest {
    WebDriver driver;
    HomePageObject homePageObject;
    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
        openUrl(driver, DataURLs.BEST_PRICE_URL);
    }
    @AfterClass
    public void afterClass() {
        quitBrowser();
    }

    @Test
    public void TC_01_Tim_chuyen_bay(){
        homePageObject = new HomePageObject(driver);
        homePageObject.clickToChonDiemDi();
        homePageObject.selectDiemDi();
        homePageObject.clickToChonDiemDen();
        homePageObject.selectDiemDen();
        homePageObject.inputNgayDi(DataTests.NGAY_DI);
        homePageObject.inputNgayDen(DataTests.NGAY_VE);
        homePageObject.clickToHanhKhach();
        homePageObject.clickToChildrenPlusButton();
        homePageObject.clickToTimChuyenBayButton();
        homePageObject.verifyGiaTienHienThi();
    }
}
