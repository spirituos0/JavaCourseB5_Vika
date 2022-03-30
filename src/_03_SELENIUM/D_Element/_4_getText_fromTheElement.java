package _03_SELENIUM.D_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_getText_fromTheElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        /*
            If I want to locate first child element under <div> tag, which has several children
            under the same tag (in this case under tag <h4>), I should write it this way:

            .example>h4:first-child

            "example" is a class name -> <div class="example"> ...
            * <> - angle brackets
        */
        WebElement header = driver.findElement(By.cssSelector(".example>h4:first-child"));

        String headerText = header.getText();
        System.out.println(headerText);

        driver.quit();
    }
}
