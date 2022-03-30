package _03_SELENIUM.E_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_GetNotPresentElement {
    // we need to wait until the element gets present on the website, otherwise it throws NoSuchElementException

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click(); // after clicking we need to wait until 'finish' element will be present
        // loading...

        // noSuchElement exception, because element is not yet present on the website
        // when you get noSuchElementException: 1. check locator; 2. you might need to wait
        WebElement textElement = driver.findElement(By.cssSelector("#finish>h4"));
        String text = textElement.getText();
        System.out.println(text);

        driver.quit();

    }
}
