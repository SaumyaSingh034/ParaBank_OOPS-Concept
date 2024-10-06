package abstractionLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends Page{
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return null;
    }

    @Override
    public String getPageHeader() {
        return null;
    }

    @Override
    public WebElement getElement(By locator) {
        return null;
    }

    @Override
    public void waitForElementPresent(By locator) {

    }

    @Override
    public void waitForPageTitle(String title) {

    }
}
