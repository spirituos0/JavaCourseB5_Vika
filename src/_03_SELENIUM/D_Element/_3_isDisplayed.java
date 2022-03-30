package _03_SELENIUM.D_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_isDisplayed {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        WebElement invisibleText = driver.findElement(By.cssSelector("#finish>h4"));
        // this element exists in the html code, but it is not displayes ("display:none")

        boolean isTextDisplayedBefore = invisibleText.isDisplayed(); // false for now

        startButton.click();

        Thread.sleep(7000); // because there is loading

        boolean isTextDisplayedAfter = invisibleText.isDisplayed(); // true now

        System.out.println("Before Start: " + isTextDisplayedBefore);
        System.out.println("After Start: " + isTextDisplayedAfter);

        driver.quit();

    }
}
