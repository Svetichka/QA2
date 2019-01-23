package barbora.pages;

import org.openqa.selenium.By;

public class RegistrationPopup {
    private MainFunc mainFunc;
    private final By NAME_FIELD = By.name("name");

    public RegistrationPopup(MainFunc mainFunc) {
        this.mainFunc = mainFunc;
    }

    public void fillName(String name) {
        mainFunc.waitForElement(NAME_FIELD);
        mainFunc.getElement(NAME_FIELD).sendKeys(name);
    }
}