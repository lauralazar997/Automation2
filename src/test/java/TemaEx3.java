import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TemaEx3 {
    @BeforeClass
    public static void openExample() {                //test care deschide un browser, navigheaza catre un url si il inchide
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.example.com/");
        driver.close();
    }
    @Test
    public static void openApple(){                   //test care deschide un browser, navigheaza catre un url si il inchide
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");
        driver.close();
    }
}
