import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

// Class from previous lesson
public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/KsuNepomniashchaia/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        // Add implicit wait instead of
        // Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Feature is broken
        // WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        // autocompleteResult.click();

        // That's why we dismiss autocomplete
        WebElement dismissButton = driver.findElement(By.className("dismissButton"));
        dismissButton.click();


        driver.quit();
    }
}
