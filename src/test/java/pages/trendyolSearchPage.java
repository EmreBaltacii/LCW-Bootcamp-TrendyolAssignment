package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class trendyolSearchPage {
    WebDriver driver;
    WebDriverWait wait;


    public trendyolSearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void checkFilterBox () {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("slctd-fltr-item")));
    }

    public void filterByGender(String arg0) {
        driver.findElement(By.xpath("//div[text()='"+arg0+"']/..")).click();
    }

    // sleep is added to see clicked product
    public void clickByProductName(String arg0) throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'"+arg0+"')]/..")).click();
        Thread.sleep(2000);
        Set<String> tab_handles = driver.getWindowHandles();
        int number_of_tabs = tab_handles.size();
        int new_tab_index = number_of_tabs-1;
        driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
    }

    public void checkSearchedPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("dscrptn")));
    }

    public void clickEmptySpace() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("overlay")).click();
    }
}
