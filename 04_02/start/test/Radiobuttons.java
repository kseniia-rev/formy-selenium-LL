import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/KsuNepomniashchaia/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // This radio button has id
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        // This radio button doesn't have id and its name is not unique
        // Use CSS selector to find it by value
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();

        // Use Xpath as example
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        radioButton3.click();

        driver.quit();
    }
}
