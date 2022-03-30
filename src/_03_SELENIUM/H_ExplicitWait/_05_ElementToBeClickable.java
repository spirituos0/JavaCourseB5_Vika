package _03_SELENIUM.H_ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _05_ElementToBeClickable {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        WebElement registerButton = driver.findElement(By.cssSelector("a[href='/register']"));
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();




    }
}
