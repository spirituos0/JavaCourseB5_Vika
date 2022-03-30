package _03_SELENIUM.B_Get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08_GetTagName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com");

        WebElement header = driver.findElement(By.id("site-name"));
        String tagNameOfHeader = header.getTagName(); // you can find tag name of any element by using getTagName()

        System.out.println("Tag Name: " + tagNameOfHeader);

        driver.quit();
    }
}
