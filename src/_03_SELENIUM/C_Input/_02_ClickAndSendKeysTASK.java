package _03_SELENIUM.C_Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_ClickAndSendKeysTASK {

    public static void main(String[] args) throws InterruptedException {

        String num1 = "25";
        String num2 = "12";

        Integer sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        String expectedResult = sum.toString();

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        Thread.sleep(3000);

        WebElement closePopUpButton = driver.findElement(By.id("at-cv-lightbox-close"));
        closePopUpButton.click();

        Thread.sleep(3000);
        WebElement numberInput1 = driver.findElement(By.id("sum1"));
        WebElement numberInput2 = driver.findElement(By.id("sum2"));

        numberInput1.sendKeys(num1);
        numberInput2.sendKeys(num2);

        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        getTotalButton.click();

        WebElement displayedResult = driver.findElement(By.id("displayvalue"));
        String actualResult = displayedResult.getText();

        if (actualResult.equals(expectedResult))
            System.out.println("Success!");
        else
            System.out.println("Failure!");

    }
}
