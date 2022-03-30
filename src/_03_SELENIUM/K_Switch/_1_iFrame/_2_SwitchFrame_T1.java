package _03_SELENIUM.K_Switch._1_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class _2_SwitchFrame_T1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame2");

        WebElement animalsDropdown = driver.findElement(By.id("animals"));
        Select avatarSelect = new Select(animalsDropdown);
        avatarSelect.selectByVisibleText("Avatar");

        driver.switchTo().defaultContent();

        WebElement homeBtn = driver.findElement(By.xpath("(//a[@id='head'])[1]"));
        homeBtn.click();

    }
}
