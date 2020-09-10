package Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverService {
    public WebDriver getNewDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //Open Chrom Browser

        return driver;
    }
}
