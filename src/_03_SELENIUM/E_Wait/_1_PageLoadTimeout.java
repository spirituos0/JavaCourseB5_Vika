package _03_SELENIUM.E_Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _1_PageLoadTimeout {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        // if the page is not loaded within 5 seconds, we will get an exception

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.quit();


    }
}
