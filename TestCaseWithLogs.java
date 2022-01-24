package validate_log4j;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class TestCaseWithLogs {

    public static void main(String[] args) {


        Logger logger=Logger.getLogger("TestCaseWithLogs");
        PropertyConfigurator.configure("Log4j.properties");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        logger.info("browser opened");
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        logger.info("Entering contact Information");
        driver.findElement(By.id("email")).sendKeys("Honey");
        driver.findElement(By.id("pass")).sendKeys("123456789");
        logger.info("Clicked on Login button");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}

