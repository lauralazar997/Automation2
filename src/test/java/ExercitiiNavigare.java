import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v143.audits.model.SRIMessageSignatureError;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExercitiiNavigare {

    @Test
    public void originalTabTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        String originalTab = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/forms");
        driver.switchTo().window(originalTab);
    }


    @Test
    public void exNavigare(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.get("https://demoqa.com/elements");

        String elemementsTitle = driver.getTitle();

        driver.get("https://demoqa.com/forms");
        driver.navigate().back();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       String currentURL = driver.getCurrentUrl();
       Assert.assertTrue(currentURL.contains("elements"), "Nu suntem pe pagina Elements");

       try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       driver.navigate().forward();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       currentURL = driver.getTitle();
       Assert.assertTrue(currentURL.contains("forms"), "Nu suntem pe forms");

       driver.navigate().refresh();
    }


    @Test
    public static void ex3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        String titlu = driver.getTitle();
        driver.navigate().to("https://demoqa.com/alerts");
        driver.navigate().to("https://demoqa.com/widgets");
        driver.navigate().back();
        driver.navigate().back();
        String titluDupaBack = driver.getTitle();
        Assert.assertEquals(titlu, titluDupaBack, "Nu s-a facut back");
    }


    @Test
    public static void ultimulExercitiuCuTabs(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        String pageTitle1 = driver.getTitle();
        System.out.println(pageTitle1);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/elements");

        pageTitle1 = driver.getTitle();
        System.out.println(pageTitle1);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/forms");

        pageTitle1 = driver.getTitle();
        System.out.println(pageTitle1);


        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/alerts");

        pageTitle1 = driver.getTitle();
        System.out.println(pageTitle1);
        driver.close();
        driver.quit();
    }
}
