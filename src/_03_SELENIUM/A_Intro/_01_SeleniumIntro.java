package _03_SELENIUM.A_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_SeleniumIntro {

    public static void main(String[] args) {

        // Define driver type and path
        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        // Create a new WebDriver object
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();

        // Navigate to any website - .get() method
        driver.get("https://techno.study/");

        // Quit browser after all the actions above
        driver.quit();

    }
}
