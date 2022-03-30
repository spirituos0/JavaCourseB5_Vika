package _03_SELENIUM.J_Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _2_ScrollingAllTheWayDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // This will scroll all the way down to the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }
}
