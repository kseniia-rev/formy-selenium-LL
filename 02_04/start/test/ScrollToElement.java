import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/KsuNepomniashchaia/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        // Move to element (scrolling page with large content)
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Kseniia Nepomniashchaia");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("12/26/2021");

        driver.quit();
    }
}
