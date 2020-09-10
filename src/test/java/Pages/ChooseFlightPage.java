package Pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Data
public class ChooseFlightPage {

    @FindBy(xpath = "//input[@value='Choose This Flight']")
    List<WebElement> chooseFlight;

    public ChooseFlightPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
