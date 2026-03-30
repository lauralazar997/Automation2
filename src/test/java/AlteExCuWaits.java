import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlteExCuWaits {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Test
public WebElement alDoileaEx(By locator){
        driver.get("https://demoqa.com/dynamic-properties");
        WebElement buttonVizibl = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    return buttonVizibl;
    }
}