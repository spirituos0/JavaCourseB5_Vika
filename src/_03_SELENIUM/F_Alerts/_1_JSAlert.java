package _03_SELENIUM.F_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_JSAlert {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement JSAlertButton = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        JSAlertButton.click();

        // To handle alerts we need to use driver.switchTo().alert() method
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println("Alert Text: " + alertText);
        String successMessage = driver.findElement(By.id("result")).getText();

        if (successMessage.equals("You successfully clicked an alert!"))
            System.out.println("Congrats! You handled an alert!");
        else
            System.out.println("failure");

        driver.quit();
    }
}
