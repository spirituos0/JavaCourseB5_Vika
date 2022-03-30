package _03_SELENIUM.I_XPath._02_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class _4_DragAndDrop {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement advancedSecurityButton = driver.findElement(By.id("details-button"));
        advancedSecurityButton.click();
        WebElement proceedToWebsiteButton = driver.findElement(By.id("proceed-link"));
        proceedToWebsiteButton.click();

        // DEBIT SIDE

        // 1. we select an item:
        WebElement fiveThousandButton = driver.findElement(By.xpath("(//li[@id='fourth']//a)[2]"));
        // 2. then select place, where to drop:
        WebElement debitAmountTarget = driver.findElement(By.id("amt7"));
        // 3. then perform the action:
        Actions actions = new Actions(driver);
        // 4. we provide two arguments: WHAT to select (source) and WHERE to drop (target)
        actions.dragAndDrop(fiveThousandButton, debitAmountTarget).perform();

        WebElement bankAccButton = driver.findElement(By.xpath("//li[@id='credit2']//a"));
        WebElement debitAccTarget = driver.findElement(By.id("bank"));

        actions.dragAndDrop(bankAccButton, debitAccTarget).perform();

        // CREDIT SIDE

        WebElement creditAmountTarget = driver.findElement(By.id("amt8"));

        actions.dragAndDrop(fiveThousandButton, creditAmountTarget).perform();

        WebElement salesButton = driver.findElement(By.xpath("//li[@id@='credit1']//a"));
        WebElement creditAccTarget = driver.findElement(By.id("loan"));

        actions.dragAndDrop(salesButton, creditAccTarget).perform();



    }
}
