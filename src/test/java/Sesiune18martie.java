import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class Sesiune18martie {
    @Test
    public void testButtons() {                   //metoda care da dublu si right click
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actiuni = new Actions(driver);
        actiuni.doubleClick(doubleClickButton).perform();

        WebElement output = driver.findElement(By.id("doubleClickMessage"));
        Assert.assertTrue(output.isDisplayed(), "Nu s-a apasat dublu click");

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));             //dam click dreapta si verificam
        actiuni.contextClick(rightClickButton).perform();
        WebElement outputRight = driver.findElement(By.id("rightClickMessage"));
        Assert.assertTrue(outputRight.isDisplayed(), "Nu s-a dat click dreapta");
    }

}
