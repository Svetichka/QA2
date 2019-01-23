package barbora.pages;

import org.openqa.selenium.By;

public class LoginPopup {
    private MainFunc mainFunc;
    private final By REG_BTN = By.xpath(".//a[@aria-controls = 'b-user-register']");

    public LoginPopup(MainFunc mainFunc) {
        this.mainFunc = mainFunc;
    }

    public RegistrationPopup goToRegistration() {
        mainFunc.getElement(REG_BTN).click();
        return new RegistrationPopup(mainFunc);
    }
}
