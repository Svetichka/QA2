package barbora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage {
    private MainFunc mainFunc;
    private final By PRODUCT = By.xpath(".//div[@itemprop = 'isRelatedTo']");
    private final By PRODUCT_NAME = By.xpath(".//span[@itemprop = 'name']");
    private final By PRODUCT_BTN = By.xpath(".//button[@aria-label = 'Pievienot']");

    public MainPage(MainFunc mainFunc) {
        this.mainFunc = mainFunc;
    }

    public WebElement getProductByName(String name) {
        List<WebElement> products = mainFunc.getElements(PRODUCT);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).findElement(PRODUCT_NAME).getText().equals(name)) {
                return products.get(i);
            }
        }
        return null;
    }

    public LoginPopup clickOnProductByName(String name) {
        getProductByName(name).findElement(PRODUCT_BTN).click();
        return new LoginPopup(mainFunc);
    }
}