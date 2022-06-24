package stepDefinitions;

import io.cucumber.java.en.And;
import pages.cartPage;
import util.DriverFactory;

public class cartPageSteps {
    cartPage CartPage = new cartPage(DriverFactory.getDriver());

    @And("I verify that cart count is increased")
    public void iVerifyThatCartCountIsIncreased() {
        CartPage.checkCartIncrease();
    }

    @And("I remove product from cart")
    public void iRemoveProductFromCart() {
        CartPage.removeProduct();
    }

    @And("I verify that product is removed from cart")
    public void iVerifyThatProductIsRemovedFromCart() {
        CartPage.checkCartIsEmpty();
    }
}
