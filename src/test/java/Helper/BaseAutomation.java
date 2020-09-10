package Helper;

import Config.UrlConfig;
import org.testng.annotations.BeforeClass;

public class BaseAutomation {

    public UrlConfig urlConfig;
    public DriverService driverService;


    @BeforeClass
    public void initBase() {
        this.urlConfig = new UrlConfig();
        this.driverService = new DriverService();

    }

}
