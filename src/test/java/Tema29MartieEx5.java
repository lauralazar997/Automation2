import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tema29MartieEx5 {

    //EX5
    @Test(priority = -1)
    public void ex5test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "demosite", "Nu este corect titlul");
    }

    @Test(priority = 0)
    public void ex5test2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.close();
    }

    @Test(priority = 1)
    public void ex5test3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/links");
        WebElement link = driver.findElement(By.id("dynamicLink"));
        link.click();
    }
}
