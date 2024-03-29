package _03_SELENIUM.G_Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _00_SelectDropdown {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement daysDropdown = driver.findElement(By.id("select-demo"));

        Select selectDay = new Select(daysDropdown);
        selectDay.selectByVisibleText("Saturday");
//        selectDay.selectByIndex(4);
//        selectDay.selectByValue("Tuesday");

        driver.quit();

    }
}
