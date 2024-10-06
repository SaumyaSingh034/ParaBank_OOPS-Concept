package pageLayer;

import abstractionLayer.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By userNamame = By.xpath("//input[@name='username']");
    private By passWord = By.xpath("//input[@name='password']");
    private By loginBtn = By.xpath("//input[@value='Log In']");
    private By registerBtn = By.xpath("//*[text()='Register']");
    private By forgetPassword = By.xpath("//*[text()='Forgot login info?']");

}
