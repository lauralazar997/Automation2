import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Navigare {
    WebDriver driver;

    @Test
    public void exercitiiNavigare1(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        String titlulPaginii = driver.getTitle();       //afisarea titlului din tab-ul deschis
        System.out.println(titlulPaginii);



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().to("https://demoqa.com/elements");

        String URLcurent = driver.getCurrentUrl();
        System.out.println(URLcurent);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
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
        driver.navigate().refresh();

    }
}
