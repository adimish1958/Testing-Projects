package Pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class SearchPage {

    @FindBy(css = "body > div.container > form > select:nth-child(1)")
    WebElement depCity;

    @FindBy(css = "body > div.container > form > select:nth-child(4)")
    WebElement desCity;

    @FindBy(css = "body > div.container > form > div > input")
    WebElement findFlights;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
