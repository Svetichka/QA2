package CucumberStepDefinitions.Pages;

import org.openqa.selenium.By;

   public class RegistrationSeatPage {
       private BaseFunctions baseFunctions;

       public RegistrationSeatPage(BaseFunctions baseFunctions) {
           this.baseFunctions = baseFunctions;
       }

       private final By SEAT = By.xpath(".//[(@class 'seat')]");
       private final By BOOK = By.id("book2");

       public RegistrationSeatPage clickOnSeat() {
           baseFunctions.click(SEAT);
           return new RegistrationSeatPage(baseFunctions);
       }

       public RegistrationSeatPage clickOnGoBookButtonAgain() {
           baseFunctions.click(BOOK);
           return new RegistrationSeatPage(baseFunctions);
       }


   }