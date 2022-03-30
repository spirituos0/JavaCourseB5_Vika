package _03_SELENIUM.H_ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _01_VisibilityOfElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        // Implicit wait cannot check visibility of element
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        WebElement finishText = driver.findElement(By.id("finish"));
        wait.until(ExpectedConditions.visibilityOf(finishText));

        String result = finishText.getText();

        System.out.println(result);
        // selenium found an element, but it was not waiting till this element appears
        // that's why there is no text printed in the output

        driver.quit();
    }
}
