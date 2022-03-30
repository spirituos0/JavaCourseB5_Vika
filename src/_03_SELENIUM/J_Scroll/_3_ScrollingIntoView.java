package _03_SELENIUM.J_Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _3_ScrollingIntoView {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement enrollNow = driver.findElement(By.xpath("(//a[@href='/enroll#enroll'])[4]"));

        // scroll to a specific element:
        js.executeScript("arguments[0].scrollIntoView();", enrollNow);
    }
}
