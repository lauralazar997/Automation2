import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExercitiiLocatori {

    @Test
    public void textBoxTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        Actions actions = new Actions(driver);

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        //WebElement submit = driver.findElement(By.id("submit")); - o varianta de a declara by id
        WebElement submit = driver.findElement(By.className("btn-primary"));   //-o alta varianta e by class name - daca e format numele din ceva spatiu ceva nu va merge, trebuie doar partea fara spatiu

        fullName.sendKeys("Laura");
        email.sendKeys("blabla@blabla.com");
        currentAddress.sendKeys("Cluj-Napoca");
        permanentAddress.sendKeys("Cluj");

        actions.scrollToElement(submit).perform();
        submit.click();


        WebElement output = driver.findElement(By.id("output"));

        Assert.assertTrue(output.isDisplayed());
    }
}