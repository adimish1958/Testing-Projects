package Utils;


import Pages.FinalPage;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;


public class ValidateUtil {

    public static String getIDFromTable(WebDriver driver) throws Exception {

        FinalPage finalPage=new FinalPage(driver);
        String id=finalPage.getIdTab().getText();
        return id;

    }

    public static String getIDFromJson(WebDriver driver) throws Exception {

        FinalPage finalPage=new FinalPage(driver);
        String id1=finalPage.getIdJson().getText();
        JSONParser parser=new JSONParser();
        JSONObject json=(JSONObject)parser.parse(id1);
        String id=(String)json.get("id");
        return id;

    }


}

