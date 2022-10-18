package in.amazon.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UI_Steps {

    @Given("As a user I Navigate to baseURL")
    public void iNavigateToBaseUrl() {
        System.out.println("Navigate to Base URL by Driver Init");
    }

    @When("Click on the hamburger menu in the top left corner")
    public void clickOnHamburgerMenu() {
    }

    @When("Scroll down and then Click on the TV, Appliances and Electronics link under Shop by Department section")
    public void scrollAndClickOnTvAppliancesElectronics() {
    }

    @When("Click on Televisions under Tv, Audio & Cameras sub section")
    public void clickOnTelevisions() {
    }

    @When("Scroll down and filter the results by Brand {string}")
    public void scrollAndFilterResultsByBrand(String string) {
    }

    @When("Sort the {string} results with price {string}")
    public void sortResultsWithPrice(String string, String string2) {
    }

    @When("Click on the second highest priced item")
    public void clickOnSecondHighestPricedItem() {
    }

    @When("Switch the Window")
    public void switchTheWindow() {
    }

    @Then("Assert that {string} section is present")
    public void assertSection(String string) {
    }

    @Then("Log this section text to console")
    public void logSectionTextToConsole() {
    }
}