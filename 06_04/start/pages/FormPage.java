import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Kseniia");

        driver.findElement(By.id("last-name")).sendKeys("Nepomniashchaia");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='3']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("01/21/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
