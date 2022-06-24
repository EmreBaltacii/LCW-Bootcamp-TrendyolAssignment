package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class trendyolHomePage {

    WebDriver driver;
    WebDriverWait wait;

    public trendyolHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

     public void selectGender() {
         driver.findElement(By.className("homepage-popup-img")).click();
    }

    public void checkHomePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".styles-module_sliderBase__swkx1.carousel")));
    }

    public void enterSearchData(String arg0) {
        driver.findElement(By.cssSelector("input.search-box")).sendKeys(arg0);
    }

    public void clickSearchButton() throws InterruptedException {
        driver.findElement(By.className("search-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("search-icon")).click();
    }
}
