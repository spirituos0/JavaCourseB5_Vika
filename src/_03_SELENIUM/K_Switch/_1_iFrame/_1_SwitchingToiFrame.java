package _03_SELENIUM.K_Switch._1_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _1_SwitchingToiFrame {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/frames");

        // If we don't switch, we get NoSuchElementException, because the element is inside the iFrame.

        // Before locating the element, we need to switch to iFrame:
        driver.switchTo().frame("frame1");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("Hello");

        // nested iFrame. We need to switch from one iFrame to another one:
        driver.switchTo().frame("frame3");

        // and then work with the elements inside:
        WebElement checkbox = driver.findElement(By.id("a"));
        checkbox.click();

        // Now if we want to do something outside the iFrame, we need to switch back:
        driver.switchTo().defaultContent(); // switch to the very top iFrame (not only 1 frame)

        WebElement uiPathButton = driver.findElement(By.xpath("//a[@text()='UiPath']"));
        uiPathButton.click();


    }
}
