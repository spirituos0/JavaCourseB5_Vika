package _03_SELENIUM.E_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_GetNotPresentException_ThreadSleep {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();

        Thread.sleep(6000); // handled exception with thread.sleep

        WebElement textElement = driver.findElement(By.cssSelector("#finish>h4"));
        String text = textElement.getText();
        System.out.println(text);

        driver.quit();
    }
}
