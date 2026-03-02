import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {

    @Test
    public void openGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

}
