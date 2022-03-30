package _03_SELENIUM.A_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_OpeningWebsite {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        // we use get() method to be able to open a website
        driver.get("https://campus.techno.study");

        driver.quit();


    }
}
