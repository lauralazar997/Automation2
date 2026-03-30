import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tema29Martie {
    WebDriverWait wait;

    //Exercitiul 1 - deschide 2 tab-uri cu 2 site-uri si le afiseaza titlul
    @Test
            public void ex1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        String titluPaginaTab1 = driver.getTitle();
        System.out.println(titluPaginaTab1);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.emag.ro/");
        String titluPaginaTab2 = driver.getTitle();
        System.out.println(titluPaginaTab2);
    }

//ex2 - deschide 2 tab-uri, verifica titlurile, salveaza window handles si navigheaza intre tabs
    @Test
            public void ex2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String titluTab = driver.getTitle();
        System.out.println(titluTab);

       Assert.assertTrue(titluTab.contains("demosite"));
       String tab1 = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://practicesoftwaretesting.com/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        titluTab = driver.getTitle();
        System.out.println(titluTab);
        Assert.assertTrue(titluTab.contains("Practice Software Testing"));

        String tab2 = driver.getWindowHandle();

        driver.switchTo().window(tab1);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        titluTab = driver.getTitle();
        Assert.assertTrue(titluTab.contains("demosite"));

    }


    //EX3
    @Test(groups = {"regression"})
    public void ex3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();

        String tabTitle = driver.getTitle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();

        driver.close();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(tabTitle.contains("Practice Software Testing"));
    }



    //Ex4
    @Test
    public void ex4(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");

        String tab1 = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://practicesoftwaretesting.com/category/hand-tools");

        WebElement produs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("data-test='product-name']")));
        String numeProdus = produs.getText();
        String linkProdus = produs.getAttribute("href");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(linkProdus);

        wait.until(ExpectedConditions.titleContains(numeProdus));
        Assert.assertTrue(driver.getTitle().contains(numeProdus), "Nu s-a selectat produsul dorit");

        driver.switchTo().window(tab1);
        driver.navigate().refresh();
        Assert.assertTrue(driver.getTitle().contains("Practice Software Testing"), "Nu s-a revenit pe primul tab");

    }
}
