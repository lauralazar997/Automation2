import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExercitiiWaits {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Test
    public void testElementClickable() {
        driver.get("https://demoqa.com/dynamic-properties");
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        button.click();
    }

    @Test
    public void testElementVisible(){
    driver.get("https://demoqa.com/dynamic-properties");
    WebElement button3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
    boolean visibleButton = button3.isDisplayed();
    System.out.println(visibleButton);
    }

    @Test
    public void testElementTextIsPresent(){
        driver.get("https://demoqa.com/dynamic-properties");
        boolean buttonText = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("visibleAfter"), "Visible After 5 Seconds"));
        Assert.assertTrue(buttonText, "Textul nu este afisat");
    }
}
