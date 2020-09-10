package Utils;

import Pages.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.util.Properties;

public class FormUtil {

    public static void doForm(WebDriver driver) throws Exception {

        FormPage formPage=new FormPage(driver);
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\admimish.ORADEV\\IdeaProjects\\Automation-testing\\form.properties");
        prop.load(fis);
        formPage.getName().sendKeys(prop.getProperty("name"));
        formPage.getAddress().sendKeys(prop.getProperty("address"));
        formPage.getCity().sendKeys(prop.getProperty("city"));
        formPage.getState().sendKeys(prop.getProperty("state"));
        formPage.getZipCode().sendKeys(prop.getProperty("zipcode"));
        Select ct=new Select(formPage.getCardType());
        ct.selectByValue(prop.getProperty("cardtype"));
        formPage.getCC().sendKeys(prop.getProperty("cc"));
        formPage.getCCMonth().sendKeys(prop.getProperty("ccmonth"));
        formPage.getCCYear().sendKeys(prop.getProperty("ccyear"));
        formPage.getNameCard().sendKeys(prop.getProperty("namecard"));

        formPage.getPurchase().click();

    }
}

