import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.time.Duration;

public class testValid {
    WebDriver driver;

    @Test
    public void testCaseValid(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select dropdown = new Select(oldSelectMenu);
        dropdown.selectByVisibleText("Blue");

        String checkIfBlue = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(checkIfBlue, "Blue", "Not blue");

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
    @Test
//    Folosind pagina https://practicesoftwaretesting.com/
//    a. Navighează la lista de produse.
//    b. Identifică dropdown-ul Sort.
//    c. Selectează opțiunea Price (High → Low).
//    d. Verifică că primul produs are prețul mai mare decât produsul următor.

    public void testSortingByPrice(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");
        WebElement sortButton = driver.findElement(By.xpath("//select[@data-test='sort']"));
        Select select = new Select(sortButton);
        select.selectByValue("price,desc");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        //pentru ca nu ne-a dat valorile bune, deoarece filtrul nu s-a incarcat, avem nevoie de un wait
        //am folosit un wait ca sa verificam ca primul element este cel care trebuie
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//h5[@class='card-title'])[1]"),"Drawer Tool Cabinet"));


        WebElement mostExpensiveProduct = driver.findElement(By.xpath("(//span[@data-test='product-price'])[1]"));
        WebElement nextMostExpensiveProduct = driver.findElement(By.xpath("(//span[@data-test='product-price'])[2]"));

        String firstProductPrice = mostExpensiveProduct.getText();
        String secondProductPrice = nextMostExpensiveProduct.getText();

        System.out.println(firstProductPrice);
        System.out.println(secondProductPrice);

        firstProductPrice = firstProductPrice.replace("$", "");
        secondProductPrice = secondProductPrice.replace("$", "");

        double price1 = Double.parseDouble(firstProductPrice);
        double price2 = Double.parseDouble(secondProductPrice);

        System.out.println(price1);
        System.out.println(price2);

        Assert.assertTrue(price1>price2, "Primul pret nu este mai mare decat al doilea");
    }
}

