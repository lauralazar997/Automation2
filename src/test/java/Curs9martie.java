import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Curs9martie {

    @Test
    public void Exercises() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        String fullNameValue = "Laura Lazar";
        fullName.sendKeys(fullNameValue);
        WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        userEmail.sendKeys("lauralazar@test.com");
        WebElement address = driver.findElement(By.xpath("(//textarea)[1]"));
        address.sendKeys("Cluj");
        WebElement permanentAddress = driver.findElement(By.xpath("(//textarea)[2]"));
        permanentAddress.sendKeys("Cluj-Napoca");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        WebElement output = driver.findElement(By.id("output"));
       // Assert.assertTrue(output.isDisplayed());
        String outputName = driver.findElement(By.id("name")).getText();
        System.out.println(outputName);
        //Assert.assertEquals(outputName, "Name:Laura Lazar", "Ouput name is not correct"); //asa se poate dar trebuie sa dam output-ul corect exact
        Assert.assertTrue(outputName.contains(fullNameValue));
    }

    @Test
    public void submitDisplayedEnabled() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        String fullNameValue = "Laura Lazar";
        fullName.sendKeys(fullNameValue);
        WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        userEmail.sendKeys("lauralazar@test.com");
        WebElement address = driver.findElement(By.xpath("(//textarea)[1]"));
        address.sendKeys("Cluj");
        WebElement permanentAddress = driver.findElement(By.xpath("(//textarea)[2]"));
        permanentAddress.sendKeys("Cluj-Napoca");
        WebElement submit = driver.findElement(By.id("submit"));
        //submit.click();
       Assert.assertTrue(submit.isDisplayed());           //verifica daca butonul submit e displayed
       Assert.assertTrue(submit.isEnabled());              //verifica daca butonul submit e enabled
    }

    @Test
    public void clickButton(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeButton.click();
        WebElement outputClickMeButton = driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertTrue(outputClickMeButton.isDisplayed());
        String outputClickMe = outputClickMeButton.getText();
        Assert.assertEquals(outputClickMe, "You have done a dynamic click", "Message is not correct");

        //asa, sau asa:
        //boolean outputClickMeButton = driver.findElement(By.id("dynamicClickMessage")).isDisplayed();
        //Assert.assertTrue(outputClickMeButton, "Butonul nu s-a apasat");
    }
    @Test
    public void exercitiuClear(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebElement name = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        name.sendKeys("Laura Lazar");
        WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        userEmail.sendKeys("lauralazar@test.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        name.clear();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        name.sendKeys("Lazar123457");
    }
}

