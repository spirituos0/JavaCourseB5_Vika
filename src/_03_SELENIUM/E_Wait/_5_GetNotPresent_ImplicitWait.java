package _03_SELENIUM.E_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _5_GetNotPresent_ImplicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*
            Implicit Wait :
              - will wait for 10 seconds before throwing NoSuchElementException,
                but during 10 seconds Selenium will keep trying to find the element
                and if Selenium finds the element after 3 seconds, 7 seconds will not be wasted,
                because script will continue executing the code right after the element is found.

              - If the element is never found, it will not wait forever, 10 seconds is the limit.

              - This is going to affect all the elements that we have in the code. 10 seconds for each execution,
                if it ever needs any waiting time, but limited by 10 seconds
            */

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();

        WebElement textElement = driver.findElement(By.cssSelector("#finish>h4"));
        String text = textElement.getText();
        System.out.println(text);

        driver.quit();
    }
}
