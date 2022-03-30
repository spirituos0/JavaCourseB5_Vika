package _03_SELENIUM.I_XPath._02_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class _5_HoverOver {
    // if element is not yet visible on the website (button),
    // you need first to press to one button to get the one that we need

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/");

        WebDriverWait wait = new WebDriverWait(driver,5);
        Actions actions = new Actions(driver);

        WebElement homeAndLiving = driver.findElement(By.xpath("//a[text()='Home & Living']"));
        actions.moveToElement(homeAndLiving).perform();
        // we are not yet clicking anywhere, we just do hoverOver action to make our needed element visible on the website

        WebElement carpets = driver.findElement(By.xpath("//a[text()='Carpets']"));
        wait.until(ExpectedConditions.elementToBeClickable(carpets));
        carpets.click();



    }
}
