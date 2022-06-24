package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.productPage;
import util.DriverFactory;

public class productPageSteps {
    productPage ProductPage = new productPage(DriverFactory.getDriver());

    @Then("I add product to the cart")
    public void iAddProductToTheCart() {
        ProductPage.addProductToCart();
    }

    @When("I navigate to cart page")
    public void iNavigateToCartPage() throws InterruptedException {
        ProductPage.clickGoToCart();
    }
}
