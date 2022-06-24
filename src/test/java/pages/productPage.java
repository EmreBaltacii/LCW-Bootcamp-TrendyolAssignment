package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productPage {
    WebDriver driver;
    WebDriverWait wait;

    public productPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        }

        public void addProductToCart() {
        driver.findElement(By.className("add-to-basket")).click();
    }

    public void clickGoToCart() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".goBasket")).click();
    }
}
