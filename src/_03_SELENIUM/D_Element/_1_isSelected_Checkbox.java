package _03_SELENIUM.D_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_isSelected_Checkbox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
        boolean isCheckboxSelectedBEFOREClicking = checkbox.isSelected();

        Thread.sleep(3000);

        checkbox.click();

        Thread.sleep(3000);

        boolean isCheckboxSelectedAFTERClicking = checkbox.isSelected();

        System.out.println("Before Click: " + isCheckboxSelectedBEFOREClicking);
        System.out.println("After Click: " + isCheckboxSelectedAFTERClicking);


    }
}
