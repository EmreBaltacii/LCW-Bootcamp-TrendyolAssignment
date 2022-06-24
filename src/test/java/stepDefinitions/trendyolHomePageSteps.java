package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.trendyolHomePage;
import util.DriverFactory;

public class trendyolHomePageSteps {
    
    trendyolHomePage TrendyolHomePage = new trendyolHomePage(DriverFactory.getDriver());

    @Given("as a user I am on Home page")
    public void asAUserIAmOnHomePage() throws InterruptedException {
        TrendyolHomePage.selectGender();
        TrendyolHomePage.checkHomePage();
    }

    @When("fill search field with {string} data")
    public void fillSearchFieldWithData(String arg0) {
        TrendyolHomePage.enterSearchData(arg0);
    }

    @Then("I click search button")
    public void iClickSearchButton() throws InterruptedException {
        TrendyolHomePage.clickSearchButton();
    }
}
