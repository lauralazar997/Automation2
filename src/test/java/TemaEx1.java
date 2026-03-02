import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TemaEx1 {
    @Test
    public static void openFacebook() {                //test care deschide un browser, navigheaza catre un url si il inchide browserul
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.close();
    }
}