package commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

import java.io.File;

public class BaseTest extends AbstractPage {
    private WebDriver driver;
    protected final Logger logger;

    public BaseTest(){
        logger = LogManager.getLogger(getClass());
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected WebDriver getBrowserDriver(String browserName) {
        switch (browserName) {
            case "chrome":
                //WebDriverManager.chromedriver().clearDriverCache().setup();
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                //WebDriverManager.firefoxdriver().clearDriverCache().setup();
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new RuntimeException("Please enter the correct Browser name!!!");
        }

        maximizeBrowsers(driver);
        implicitWaitBrowser(driver);
        return driver;
    }


    protected WebDriver quitBrowser() {
        closeBrowsers(driver);
        return driver;
    }

}

