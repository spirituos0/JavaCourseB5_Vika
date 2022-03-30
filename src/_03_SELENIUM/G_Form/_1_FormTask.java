package _03_SELENIUM.G_Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class _1_FormTask {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://facebook.com");

        // 1. click create acc
        WebElement createAcc = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createAcc.click();

//        driver.switchTo().alert();

        // 2. fill the form
        WebElement firstNameInput = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameInput.sendKeys("Steven");
//
        WebElement lastNameInput = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastNameInput.sendKeys("King");

        WebElement emailOrMobile = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        emailOrMobile.sendKeys("test@technostudy.com");

        WebElement emailOrMobileConfirm = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        emailOrMobileConfirm.sendKeys("test@technostudy.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
        passwordInput.sendKeys("3478681735!#$%ASDHsdhdh");

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByValue("12");

        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select selectDay = new Select(dayDropdown);
        selectDay.selectByIndex(10);

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText("1997");

        WebElement radioFemale = driver.findElement(By.cssSelector("input[value='1']"));
        radioFemale.click();

        String signUpText = driver.findElement(By.cssSelector("button[name='websubmit']")).getText();
        System.out.println(signUpText);

        driver.quit();





    }
}
