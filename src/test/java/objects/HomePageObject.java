package objects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.HomePageUI;

public class HomePageObject extends AbstractPage {
    WebDriver driver;

    public HomePageObject(WebDriver driver){
        this.driver = driver;
    }
    public void clickToChonDiemDi() {
        clickToElement(driver, HomePageUI.CHON_DIEM_DI_BUTTON);
    }

    public void selectDiemDi() {
        waitToElementPresence(driver, HomePageUI.DIEM_DI_SELECT);
        clickToElementByJS(driver, HomePageUI.DIEM_DI_SELECT);
        //clickToElement(driver, HomePageUI.DIEM_DI_SELECT);
    }

    public void clickToChonDiemDen() {
        clickToElement(driver, HomePageUI.CHON_DIEM_DEN_BUTTON);
    }

    public void selectDiemDen() {
        waitToElementPresence(driver, HomePageUI.DIEM_DEN_SELECT);
        clickToElementByJS(driver, HomePageUI.DIEM_DEN_SELECT);
        //clickToElement(driver, HomePageUI.DIEM_DEN_SELECT);
    }

    public void inputNgayDi(String expected) {
        removeAtributteInDOM(driver, HomePageUI.NGAY_DI_DATEPICKER, "readonly");
        sendkeyToElement(driver, HomePageUI.NGAY_DI_DATEPICKER, expected);
    }

    public void inputNgayDen(String expected) {
        removeAtributteInDOM(driver, HomePageUI.NGAY_VE_DATEPICKER, "readonly");
        sendkeyToElement(driver, HomePageUI.NGAY_VE_DATEPICKER, expected);
    }

    public void clickToHanhKhach() {
        clickToElement(driver, HomePageUI.HANH_KHACH_BUTTON);
    }

    public void clickToChildrenPlusButton() {
        waitToElementClickable(driver, HomePageUI.CHILDREN_PLUS_BUTTON);
        clickToElement(driver, HomePageUI.CHILDREN_PLUS_BUTTON);
    }

    public void clickToTimChuyenBayButton() {
        clickToElement(driver, HomePageUI.TIM_CHUYEN_BAY_BUTTON);
    }

    public void verifyGiaTienHienThi() {
        waitToElementVisible(driver, HomePageUI.GIA_TIEN_LABEL);
        Assert.assertTrue(isControlDisplayed(driver, HomePageUI.GIA_TIEN_LABEL));
    }
}
