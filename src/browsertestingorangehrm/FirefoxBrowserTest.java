package browsertestingorangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        //define URL to test
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //allocate key and value to driver location in set
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        //declare an object
        WebDriver driver = new FirefoxDriver();
        //launch the page
        driver.get(baseUrl);
        //maximise the window
        driver.manage().window().maximize();
        //define maximum time to wait for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        System.out.println(driver.getTitle());
        //Print the current url
        System.out.println(driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());
        //Locate the username entry field
        WebElement usernameField = driver.findElement(By.name("username"));
        //Enter the email to email field
        usernameField.sendKeys("Admin");
        //Locate the password entry field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Enter the password to password field
        passwordField.sendKeys("admin123");
        //close driver
        driver.quit();
    }
}
