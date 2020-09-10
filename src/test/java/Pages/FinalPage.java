package Pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class FinalPage {

    @FindBy(xpath = "/html/body/div[2]/div/table/tbody/tr[1]/td[2]")
    WebElement idTab;

    @FindBy(xpath = "/html/body/div[2]/div/pre")
    WebElement idJson;



    public FinalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
