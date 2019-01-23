package CucumberStepDefinitions.Pages;

import org.openqa.selenium.By;

public class RegistrationPage {
    private BaseFunctions baseFunctions;

    public RegistrationPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    private final By BOOK = By.id("book2");

    public RegistrationPage clickOnGoBookButton() {
        baseFunctions.click(BOOK);
        return new RegistrationPage(baseFunctions);
    }


}
