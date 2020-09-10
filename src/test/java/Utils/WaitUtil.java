package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
    private static final long TIMEOUT_IN_SECONDS = 20;

    public static void waitTillElementLoad(WebDriver driver, WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, TIMEOUT_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
}
