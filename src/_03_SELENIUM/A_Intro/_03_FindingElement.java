package _03_SELENIUM.A_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.seleniumeasy.com/");

        // Steps to find an element on a website:
        // inspect page -> find part in the website, find it's id, copy -> command+F -> search

//        WebElement locateElementByCssSelector = driver.findElement(By.cssSelector("#rec370700164")); <- By.cssSelector if using #

        // Find element by using ID (using no #)
        WebElement locateElementByID = driver.findElement(By.id("rec370700164"));

        // Find element by using Class Name
        WebElement locateElementByClassName = driver.findElement(By.className("t-container"));

        // Find element by using Link Text (for <a> tag only
        WebElement locateElementByLinkText = driver.findElement(By.linkText("Home"));

        // Find element by using Partial Link Text
        WebElement locateElementByPartialLinkText = driver.findElement(By.partialLinkText("Mobile"));

        // Find element by using Tag Name
        WebElement locateElementByTagName = driver.findElement(By.tagName("h3"));

        // Find element by using CSS Selector
        WebElement locateElementByCssSelector = driver.findElement(By.cssSelector("div[class='t977__text']"));

        WebElement locateElementByCssSelector2 = driver.findElement(By.cssSelector(".t977__text"));




    }
}
