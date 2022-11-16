package browsertestingorangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        //define url to test
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //set key and value for webdriver to chromedriver
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        //declare an object
        WebDriver driver = new EdgeDriver();
        //launch page
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //set implicit time 20 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print title of current page
        System.out.println(driver.getTitle());
        //Print the current url
        System.out.println(driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());
        //locate username field
        WebElement usernameField = driver.findElement(By.name("username"));
        //Enter the username to username field
        usernameField.sendKeys("Admin");
        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Enter the password to password field
        passwordField.sendKeys("admin123");
        //Close the browser
        driver.quit();
    }
}
