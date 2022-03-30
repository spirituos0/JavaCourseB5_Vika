package _03_SELENIUM.D_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_getCssValue {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement button = driver.findElement(By.cssSelector("#input-example>button"));

        String background = button.getCssValue("background-color");
        String textAlign = button.getCssValue("text-align");

        System.out.println("Background Color: " + background);
        System.out.println("Text Align: " + textAlign);
    }
}
