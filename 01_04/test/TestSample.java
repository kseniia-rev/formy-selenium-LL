import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample  {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KsuNepomniashchaia\\chromedriver.exe");

        // Create new instance of ChromeDriver for testing in Chrome browser
        // Instantiates driver onto browser
        // Utilizes package org.openqa.selenium.chrome.ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        // Utilizes package org.openqa.selenium.WebDriver
        // WebDriver's get method launches a browser session and directs it to specified URL
        driver.get("http://www.google.com");

        // Find the text input element by its name
        // Utilizes package org.openqa.selenium.By
        // By is mechanism used to locate element with specified selector
        // After element is found, it is assigned to WebElement called element
        // This invokes package org.openqa.selenium.WebElement
        WebElement element = driver.findElement(By.name("q"));


        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form
        element.submit();

        //Close the browser
        driver.quit();
    }
}


