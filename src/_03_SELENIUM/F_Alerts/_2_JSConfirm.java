package _03_SELENIUM.F_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_JSConfirm {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement JSAlertButton = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        JSAlertButton.click();

//        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss(); // if we say 'accept', it will press 'ok'

        String message = driver.findElement(By.id("result")).getText();

        if (message.equals("You clicked: Cancel"))
            System.out.println("Congrats! You handled Alert!");
        else
            System.out.println("FAILURE");

        driver.quit();

    }
}
