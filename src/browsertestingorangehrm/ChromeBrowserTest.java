package browsertestingorangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        //Define URL to test
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //set key for webdriver to the value (chromedriver link)
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //declare an object
        WebDriver driver = new ChromeDriver();
        //Launch page
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //define max time to wait for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print title of current page
        System.out.println(driver.getTitle());
        //print current url
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());
        //get location of username field
        WebElement usernameField = driver.findElement(By.name("username"));
        //Add data
        usernameField.sendKeys("Admin");
        //get location of password field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Add data
        passwordField.sendKeys("admin123");
        //close the browser
        driver.quit();

    }
}
