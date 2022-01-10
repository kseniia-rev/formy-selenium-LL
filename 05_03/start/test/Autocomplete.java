import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/KsuNepomniashchaia/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        // Use explicit wait instead of Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dismissButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dismissButton")));
        dismissButton.click();

        // Feature is broken, dismiss autocomplete instead
        // WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        // autocompleteResult.click();
        
        driver.quit();
    }
}
