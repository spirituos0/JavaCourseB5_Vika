package _03_SELENIUM.I_XPath._01_LocatingTheElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HT1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://demo.seleniumeasy.com/input-form-demo.html");

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstNameInput.sendKeys("Nathan");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastNameInput.sendKeys("Williams");

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys("nathan.williams123@gmail.com");

        WebElement phoneInput = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneInput.sendKeys("2021345678");

        WebElement addressInput = driver.findElement(By.xpath("//input[@name='address']"));
        addressInput.sendKeys("21 N Connecticut st.");

        WebElement cityInput = driver.findElement(By.xpath("//input[@name='city']"));
        cityInput.sendKeys("Norfolk");

        WebElement stateDropdown = driver.findElement(By.xpath("//select[@name='state']"));
        Select stateSelect = new Select(stateDropdown);
        stateSelect.selectByVisibleText("Virginia");

        WebElement zipInput = driver.findElement(By.xpath("//input[@name='zip']"));
        zipInput.sendKeys("23456");

        WebElement websiteInput = driver.findElement(By.xpath("//input[@name='website']"));
        websiteInput.sendKeys("https://www.techno.study/");

        WebElement noHostingRadio = driver.findElement(By.xpath("//div[@class='radio']//input[@value='no']"));
        noHostingRadio.click();

        WebElement descriptionTextarea = driver.findElement(By.xpath("//textarea[@placeholder='Project Description']"));
        descriptionTextarea.sendKeys("This is a text area for project description.");

        WebElement sendButton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        sendButton.click();

        driver.quit();



    }
}
