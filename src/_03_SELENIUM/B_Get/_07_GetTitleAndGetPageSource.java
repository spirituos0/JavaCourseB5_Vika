package _03_SELENIUM.B_Get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_GetTitleAndGetPageSource {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        String pageSource = driver.getPageSource();
        System.out.println("Source: " + pageSource);

        driver.quit();

    }
}
