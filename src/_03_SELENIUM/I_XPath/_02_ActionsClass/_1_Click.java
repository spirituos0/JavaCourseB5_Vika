package _03_SELENIUM.I_XPath._02_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class _1_Click {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/buttons");

        // security pop up
        WebElement advancedSecurityButton = driver.findElement(By.id("details-button"));
        advancedSecurityButton.click();
        WebElement proceedToWebsiteButton = driver.findElement(By.id("proceed-link"));
        proceedToWebsiteButton.click();

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver);
        actions.click(clickMeButton).perform();
        // every time we call actions method, we need to PERFORM at the end.
        // otherwise, it is not going to work

        WebElement clickMessage = driver.findElement(By.id("dynamicClickMessage"));
        System.out.println(clickMessage.getText());

        driver.quit();

    }
}
