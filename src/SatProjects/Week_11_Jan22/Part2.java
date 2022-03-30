package SatProjects.Week_11_Jan22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Part2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("techno123.");

        WebElement signInButton = driver.findElement(By.xpath("//a[@id='log-in']"));
        signInButton.click();

        WebElement redHeader = driver.findElement(By.xpath("//h6[@id='time']"));
        String redText = redHeader.getText();
        System.out.println(redText);

        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        driver.quit();
    }
}
