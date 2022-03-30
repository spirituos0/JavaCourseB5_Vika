package _03_SELENIUM.I_XPath._01_LocatingTheElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class _01_XPathSimpleSelector {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        WebElement text = driver.findElement(By.xpath("//div[contains(text(),'quick')]"));
        System.out.println(text);

        WebElement createAccButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
/*
        WebElement createAccButtonUsingText = driver.findElement(By.xpath("a[text()='Create new account']"));
            <- this is the same element as above, but we located it by finding text on the button
 */
        createAccButton.click();

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameInput.sendKeys("Steve");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
        lastNameInput.sendKeys("Jackson");

        WebElement monthDropdown = driver.findElement(By.xpath("//select[contains(@name,'month')]"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByValue("6");

        WebElement maleRadio = driver.findElement(By.xpath("//input[@value='2']"));
        maleRadio.click();

        // a[text()='Create new account']

        WebElement ORAndAND = driver.findElement(By.xpath("//a[@role='button' and @data-testid='open-registration-form-button']"));

        driver.quit();
    }
}
