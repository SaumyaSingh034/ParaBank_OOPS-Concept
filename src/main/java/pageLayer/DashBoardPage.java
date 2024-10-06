package pageLayer;

import abstractionLayer.BasePage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends BasePage {
    public DashBoardPage(WebDriver driver) {
        super(driver);
    }
}
