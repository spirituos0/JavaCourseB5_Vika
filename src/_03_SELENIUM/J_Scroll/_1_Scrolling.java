package _03_SELENIUM.J_Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _1_Scrolling {
// this method is for short scrolling

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(2000);

        // Scroll Down by 2000 pixels
        js.executeScript("window.scrollBy(0,2000)");

        Thread.sleep(2000);

        // Scroll Up by 1000 pixels
        js.executeScript("window.scrollBy(0,-1000");


    }
}
