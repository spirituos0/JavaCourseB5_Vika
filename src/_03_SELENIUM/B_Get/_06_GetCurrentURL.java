package _03_SELENIUM.B_Get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_GetCurrentURL {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study");

        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        driver.quit();

    }
}
