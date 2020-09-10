package Utils;

import Pages.ChooseFlightPage;
import Pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class SearchUtil {

    public static Boolean doSearch(WebDriver driver, String source, String dest) throws Exception {

        SearchPage searchPage=new SearchPage(driver);
        WebElement depCity=searchPage.getDepCity();
        WebElement desCity=searchPage.getDesCity();
        WebElement find=searchPage.getFindFlights();

        //enter departure city
        Select s = new Select(depCity);
        List <WebElement> elementCount = s.getOptions();
        int iSize = elementCount.size();

       for(int i =0; i<iSize ; i++){
            String sValue = elementCount.get(i).getText();
            System.out.println(sValue);
          if(sValue.contains(source)) {
                s.selectByValue(source);
           }

        }
       if(!depCity.getText().contains(source))
           return false;

        Select d = new Select(desCity);
        List <WebElement> elementCount1 = s.getOptions();
        int iSize1 = elementCount1.size();

        for(int j =0; j<iSize1 ; j++){
            String dValue = elementCount1.get(j).getText();
            System.out.println(dValue);
            if(dValue.contains(dest)) {
                d.selectByValue(dest);
            }

        }
        if(!desCity.getText().contains(dest))
            return false;


        find.click();
        return true;


    }

    public static Boolean chooseFlight(WebDriver driver, int index) throws Exception {

        ChooseFlightPage chooseFlightPage=new ChooseFlightPage(driver);
        List<WebElement> chooseFlight=chooseFlightPage.getChooseFlight();
        if(chooseFlight.size()>=index)
        chooseFlight.get(index).click();
        else
            return false;

        return true;


    }
}

