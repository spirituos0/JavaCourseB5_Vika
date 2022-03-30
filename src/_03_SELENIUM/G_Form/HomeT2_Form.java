package _03_SELENIUM.G_Form;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomeT2_Form {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement advanceSecurityButton = driver.findElement(By.id("details-button"));
        advanceSecurityButton.click();
        WebElement proceedToWebsiteButton = driver.findElement(By.id("proceed-link"));
        proceedToWebsiteButton.click();

        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys("Antoine");

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("Douglas");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("boxingcouch@urbanboxing.com");

        WebElement radioMale = driver.findElement(By.xpath(
                "//label[text()='Male']"));
        radioMale.click();
        // //label[text()='Male']

        WebElement mobileInput = driver.findElement(By.id("userNumber"));
        mobileInput.sendKeys("5719876543");

        // DoB
        WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
        dob.click();

        WebElement monthDropdown = driver.findElement(By.cssSelector("select[class='react-datepicker__month-select']"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByValue("2");

        WebElement yearDropdown = driver.findElement(By.cssSelector("select[class='react-datepicker__year-select']"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByValue("1992");

        WebElement dayPicker = driver.findElement(By.cssSelector(
                "div[class='react-datepicker__day react-datepicker__day--023']"));
        dayPicker.click();

        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("Computer Science");
        subjectsInput.sendKeys(Keys.ENTER); // we press Enter button
        subjectsInput.sendKeys("Maths");
        subjectsInput.sendKeys(Keys.ENTER); // we press Enter button

        WebElement sportsCheckbox = driver.findElement(By.xpath("label[text()='Sports']"));
        sportsCheckbox.click();
        WebElement musicCheckbox = driver.findElement(By.xpath("label[text()='Music']"));
        musicCheckbox.click();

        WebElement currentAddress = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
        currentAddress.sendKeys("3701 Fairfax Dr");

        WebElement stateField = driver.findElement(By.cssSelector("input[id='react-select-3-input']"));
        stateField.sendKeys("Haryana");
        stateField.sendKeys(Keys.ENTER);

        WebElement cityField = driver.findElement(By.partialLinkText("Select City"));
        cityField.sendKeys("Karnal");
        cityField.sendKeys(Keys.ENTER);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

//        driver.quit();


    }
}
