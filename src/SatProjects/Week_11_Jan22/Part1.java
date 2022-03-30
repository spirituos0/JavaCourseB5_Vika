package SatProjects.Week_11_Jan22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Part1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Automation");
        System.out.println("Full name: " + fullName.getText());

        WebElement email = driver.findElement(By.cssSelector("input[id='userEmail']"));
        email.sendKeys("Testing@gmail.com");
        System.out.println("Email: " + email.getText());

        WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress"));
        currentAddress.sendKeys("Testing Current Address");
        System.out.println("Current Address: " + currentAddress.getText());

        WebElement permanentAddress = driver.findElement(By.cssSelector("#permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");
        System.out.println("Permanent Address: " + permanentAddress.getText());

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        js.executeScript("arguments[0].scrollIntoView();", submitButton);
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();

        driver.quit();

    }
}
