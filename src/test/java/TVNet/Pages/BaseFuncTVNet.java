package lekcija7.pages.java.TestTVNet.Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class BaseFuncTVNet {
    WebDriver browser;
    public BaseFuncTVNet() {
        System.setProperty("webdriver.gesko.driver", "c:/geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
    }

    public void goToURL (String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        browser.get(url);
    }

    public List<WebElement> getElements(By locator) {
        return browser.findElements(locator);
    }

    public  WebElement getElement(By locator) {
        Assertions.assertFalse(getElements(locator).isEmpty(), "There is no elements!");
        return browser.findElement(locator);
    }
    public void close() {
        browser.quit();
    }
}
