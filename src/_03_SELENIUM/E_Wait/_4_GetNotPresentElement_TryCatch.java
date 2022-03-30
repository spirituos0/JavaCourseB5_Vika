package _03_SELENIUM.E_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_GetNotPresentElement_TryCatch {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();

        String text = "";

        while (text.equals("")) {
            try {
                WebElement textElement = driver.findElement(By.cssSelector("#finish>h4"));
                text = textElement.getText();
            } catch(NoSuchElementException ex) {
                System.out.println("Trying to locate an element!");
            }
        }
        System.out.println(text);



        driver.quit();
    }
}
