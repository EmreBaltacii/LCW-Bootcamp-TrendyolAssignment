package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.trendyolSearchPage;
import util.DriverFactory;

public class trendyolSearchPageSteps {

    trendyolSearchPage TrendyolSearchPage = new trendyolSearchPage(DriverFactory.getDriver());

    @And("I verify that I see searched page")
    public void iVerifyThatISeeSearchedPage() throws InterruptedException {
        TrendyolSearchPage.clickEmptySpace();
        TrendyolSearchPage.checkSearchedPage();
    }

    @And("I filter results by {string} {string}")
    public void iFilterResults(String arg0, String arg1) {
        if (arg0.contains("TRENDYOLMİLLA") && arg1.contains("Marka")) {
            TrendyolSearchPage.filterByGender(arg0);
        }
        else {
            System.out.println("Only gender filter is acceptable yet");
        }
    }

    @Then("I verify that result list is filtered")
    public void iVerifyThatResultListIsFiltered() {
        TrendyolSearchPage.checkFilterBox();
    }

    @And("I click on product with {string} name")
    public void iClickOnProductWithName(String arg0) throws InterruptedException {
        TrendyolSearchPage.clickEmptySpace();
        TrendyolSearchPage.clickByProductName(arg0);
    }
}
