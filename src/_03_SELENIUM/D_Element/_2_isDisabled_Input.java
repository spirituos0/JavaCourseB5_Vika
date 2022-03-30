package _03_SELENIUM.D_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_isDisabled_Input {

    // there is an input field, but it is disabled until you fill out previous fields,
    // or until you check any checkboxes / radios

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement inputField = driver.findElement(By.cssSelector("#input-example>input"));
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));

        boolean isInputEnabledBefore = inputField.isEnabled();

        enableButton.click();

        Thread.sleep(3000);

        boolean isInputEnabledAfter = inputField.isEnabled();

        System.out.println("Before Enable Button: " + isInputEnabledBefore);
        System.out.println("After Enable Button: " + isInputEnabledAfter);

        driver.quit();



    }
}
