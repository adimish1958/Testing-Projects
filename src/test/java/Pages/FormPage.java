package Pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Data
public class FormPage {

    @FindBy(xpath="//input[@id='inputName']")
    WebElement Name;

    @FindBy(xpath="//input[@id='address']")
    WebElement Address;

    @FindBy(xpath="//input[@id='city']")
    WebElement City;

    @FindBy(xpath="//input[@id='state']")
    WebElement State;

    @FindBy(xpath="//select[@id='cardType']")
    WebElement CardType;

    @FindBy(xpath="//input[@id='zipCode']")
    WebElement ZipCode;

    @FindBy(xpath="//input[@id='creditCardNumber']")
    WebElement CC;

    @FindBy(xpath="//input[@id='creditCardMonth']")
    WebElement CCMonth;

    @FindBy(xpath="//input[@id='creditCardYear']")
    WebElement CCYear;

    @FindBy(xpath="//input[@id='nameOnCard']")
    WebElement NameCard;

    @FindBy(xpath="//input[@value='Purchase Flight']")
    WebElement Purchase;


    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
