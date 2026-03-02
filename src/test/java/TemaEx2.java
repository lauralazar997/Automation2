import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TemaEx2 {

    @Test
    public static void openYoutube() {                              //test care deschide un browser, URL-ul Youtube si verifica cu hard asset daca titlul este YouTube
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.Youtube.com/");

        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "YouTube";                            //- daca schimbam la expected Y sau T cu litera mica, testul va fi failed
        Assert.assertEquals(actualTitle, expectedTitle, "Verify the page title.");

    }
}

