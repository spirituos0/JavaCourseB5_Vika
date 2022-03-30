package _03_SELENIUM.I_XPath._02_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _6_HoverOverTASK {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/");

        WebDriverWait wait = new WebDriverWait(driver,5);
        Actions actions = new Actions(driver);

        WebElement beauty = driver.findElement(By.xpath("//a[@data-group='beauty']"));
        actions.moveToElement(beauty).perform();

        WebElement conditioner = driver.findElement(By.xpath("//a[text()='Conditioner']"));
        wait.until(ExpectedConditions.elementToBeClickable(conditioner));
        conditioner.click();
    }
}
