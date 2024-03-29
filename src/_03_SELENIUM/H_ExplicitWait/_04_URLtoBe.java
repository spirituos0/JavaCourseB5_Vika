package _03_SELENIUM.H_ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _04_URLtoBe {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement testNGTutorials = driver.findElement(By.cssSelector("a[href='/testng-tutorials']"));
        testNGTutorials.click();

        wait.until(ExpectedConditions.urlToBe("https://www.seleniumeasy.com/testng-tutorials"));
//        wait.until(ExpectedConditions.urlContains("testng-tutorials")); <-- same action as one above






    }
}
