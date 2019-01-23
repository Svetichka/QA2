package CucumberStepDefinitions.Pages;

import CucumberStepDefinitions.UserData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class ReservationStepDefinitions {
    private BaseFunctions baseFunctions = new BaseFunctions();
    private UserData userData = new UserData();
    private HomePage homePage;
    private RegistrationPage registrationPage;
    private RegistrationSeatPage registrationSeatPage;
    private final String URL = "qaguru.lv:8090/tickets";

    @Given("I am on home page")
    public void open_home_page() {
        baseFunctions.openPage(URL);
        homePage = new HomePage(baseFunctions);
    }

    @When("I selected departure airport (.*)")
    public void select_departure_airport(String departure) {
        homePage.selectDepartureAirport(departure);
    }

    @When("I selected arrival airport (.*)")
    public void select_arrival_airport(String arrival) {
        homePage.selectArrivalAirport(arrival);
    }

    @When("I click on GO button")
    public void click_go_button() {
        registrationPage = homePage.clickOnGoButton();
    }

    @Then("registration page appears")
    public void check_registration_page() {
    }

    @When("I fill registration form with:")
    public void fill_registration_form(Map<String, String> params) {
        userData.setName(params.get("name"));
        userData.setSurname(params.get("surname"));
        userData.setDiscountCode(params.get("discountCode"));
        userData.setPersonCount(Integer.valueOf(params.get("personCount")));
        userData.setChildrenCount(Integer.valueOf(params.get("childrenCount")));
        userData.setLuggageCount(Integer.valueOf(params.get("luggageCount")));
        userData.setdepartureDate(params.get("departureDate"));
    }

    @Then("I click on Get Price button")
    public void click_getprice_button() {
    }

    @Then("I click on Book button")
    public void click_go_book_button() {
        registrationPage = registrationPage.clickOnGoBookButton();
    }

    @Then("I select desired seat 1")
    public  void select_seat_1() {
       registrationSeatPage = registrationSeatPage.clickOnSeat();
    }

    @Then("I click on Book button again")
    public void clickBookAgain() {
        registrationSeatPage = registrationSeatPage.clickOnGoBookButtonAgain();
    }

}
