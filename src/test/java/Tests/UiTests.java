package Tests;
import Helper.BaseAutomation;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Utils.FormUtil.doForm;
import static Utils.SearchUtil.chooseFlight;
import static Utils.SearchUtil.doSearch;
import static Utils.ValidateUtil.getIDFromJson;
import static Utils.ValidateUtil.getIDFromTable;

public class UiTests extends BaseAutomation {


    private WebDriver driver;

    @BeforeClass
    public void init(){
        driver = driverService.getNewDriver();
    }

//The test select source as portland and destination as Berlin. Then Choose the 2 flight.
    //the informations filled in the form and then purchase.
    //Validate the ID appears after booking from table and json.
    @Test
    public void bookingValidationId() throws Exception {

        //Get Login Url
        driver.get(urlConfig.getLoginUrl());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Boolean searchStatus=doSearch(driver,"Portland","Berlin");
        Boolean chooseStatus=Boolean.FALSE;
        if(searchStatus.equals(true)) {
            chooseStatus = chooseFlight(driver, 1);
        }

        //Fill The Form
        if(chooseStatus.equals(true)) {
            doForm(driver);
        }

        //Get ID from Table
        String idTable=getIDFromTable(driver);
        //Get Id from Json
        String idJson=getIDFromJson(driver);
        //assert for above ids
        Assert.assertEquals(idTable,idJson);

    }

    @Test
    public void searchInvalidSource() throws Exception {

        //Get Login Url
        driver.get(urlConfig.getLoginUrl());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Assert.assertFalse(doSearch(driver,"America","Berlin"));

    }

    @Test
    public void searchInvalidDest() throws Exception {

        //Get Login Url
        driver.get(urlConfig.getLoginUrl());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Assert.assertFalse(doSearch(driver,"Portland","Delhi"));

    }
    @AfterClass
    public void close(){
        driver.quit();
    }
}
