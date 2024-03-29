package _03_SELENIUM.I_XPath._02_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class _4_DragAndDropHALIT {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement advanceSecurityButton = driver.findElement(By.id("details-button"));
        advanceSecurityButton.click();

        WebElement proceedToWebsiteButton = driver.findElement(By.id("proceed-link"));
        proceedToWebsiteButton.click();

        WebElement fiveThousandButton = driver.findElement(By.xpath("(//li[@id='fourth']//a)[2]"));
        WebElement debitAmountTarget = driver.findElement(By.id("amt7"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(fiveThousandButton, debitAmountTarget).perform();

        WebElement bankAccountButton = driver.findElement(By.xpath("//li[@id='credit2']//a"));
        WebElement debitAccountTarget = driver.findElement(By.id("bank"));

        actions.dragAndDrop(bankAccountButton, debitAccountTarget).perform();

        WebElement creditSideAmountTarget = driver.findElement(By.id("amt8"));

        actions.dragAndDrop(fiveThousandButton, creditSideAmountTarget).perform();

        WebElement salesButton = driver.findElement(By.xpath("//li[@id='credit1']//a"));
        WebElement creditSideAccountTarget = driver.findElement(By.id("loan"));

        actions.dragAndDrop(salesButton, creditSideAccountTarget).perform();

        driver.quit();

    }
}