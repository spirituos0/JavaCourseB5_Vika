package _03_SELENIUM.B_Get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_GetAttribute {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com");

        WebElement header = driver.findElement(By.id("site-name"));

        // you can get any attribute of a website using getAttribute()
        String headerAttribute = header.getAttribute("class");

        System.out.println("Attribute: " + headerAttribute);
    }
}
