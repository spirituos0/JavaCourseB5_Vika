package _03_SELENIUM.I_XPath._02_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class _3_RightClick {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/buttons");

        WebElement advancedSecurityButton = driver.findElement(By.id("details-button"));
        advancedSecurityButton.click();
        WebElement proceedToWebsiteButton = driver.findElement(By.id("proceed-link"));
        proceedToWebsiteButton.click();

        WebElement rightClickMeButton = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);
        actions.contextClick(rightClickMeButton).perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        System.out.println(rightClickMessage.getText());

        driver.quit();

    }
}
