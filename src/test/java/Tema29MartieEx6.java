import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tema29MartieEx6 {
    //EX6
    @Test(groups = {"smoke"})
    public void ex6test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "demosite", "Nu este corect titlul");
    }

    @Test(groups = {"regression"})
    public void ex6test2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.close();
    }

    @Test(groups = {"UI", "regression"})
    public void ex6test3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/links");
        WebElement link = driver.findElement(By.id("dynamicLink"));
        link.click();
    }
}
