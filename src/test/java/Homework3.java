import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework3 {
    @Test
    public void completeForm() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Test");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("User");
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("test@email.com");
        WebElement buttonGender = driver.findElement(By.id("gender-radio-2"));
        buttonGender.click();
        WebElement buttonMusic = driver.findElement(By.id("hobbies-checkbox-3"));       //extra din greseala si un hobby
        buttonMusic.click();
        WebElement nrTel = driver.findElement(By.id("userNumber"));
        nrTel.sendKeys("0773970749");
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAddress.sendKeys("Cluj-Napoca");
        WebElement subjectField = driver.findElement(By.xpath("//input[@class='subjects-auto-complete__input']"));
        subjectField.sendKeys("Homework");
        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
        WebElement modalDisplayed = driver.findElement(By.xpath("//div[@class='modal-content']"));   //?
        Assert.assertTrue(modalDisplayed.isDisplayed());                                                           //nu merge
    }
        @Test
                public void test2() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/webtables");
            WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
            addButton.click();
            WebElement firstNamePopup = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
            firstNamePopup.sendKeys("Laura");
            WebElement lastNamePopup = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
            lastNamePopup.sendKeys("Lazar");
            WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
            userEmail.sendKeys("laura@test.com");
            WebElement userAge = driver.findElement(By.xpath("//input[@placeholder='Age']"));
            userAge.sendKeys("28");
            WebElement userSalary = driver.findElement(By.xpath("//input[@placeholder='Salary']"));
            userSalary.sendKeys("1234");
            WebElement userDepartment = driver.findElement(By.xpath("//input[@placeholder='Department']"));
            userDepartment.sendKeys("1234");
            WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
            submitBtn.click();
        }
    }

