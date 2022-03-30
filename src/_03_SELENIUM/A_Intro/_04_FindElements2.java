package _03_SELENIUM.A_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_FindElements2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techno.study/");

        driver.findElement(By.tagName("h3"));

        WebElement webElement = driver.findElement(By.tagName("a"));
        System.out.println(webElement.getText());

        System.out.println("____________");

        List<WebElement> webElementList = driver.findElements(By.tagName("a"));

        for (int i = 0; i < webElementList.size(); i++) {
            System.out.println(webElementList.get(i).getText());
        }

    }
}
