package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage {
    WebDriver driver;
    WebDriverWait wait;

    public cartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void checkCartIncrease() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("pb-header")));
    }

    public void removeProduct() {
        driver.findElement(By.className("i-trash")).click();
        driver.findElement(By.cssSelector(".ty-font-w-semi-bold.ty-button.ty-bordered.ty-transition.ty-input-medium.ty-primary")).click();
    }

    public void checkCartIsEmpty() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Sepetinde ürün bulunmamaktadır.']")));
    }
}
