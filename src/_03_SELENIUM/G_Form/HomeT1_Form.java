package _03_SELENIUM.G_Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomeT1_Form {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        WebElement firstNameInput = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameInput.sendKeys("Anna");

        WebElement lastNameInput = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastNameInput.sendKeys("Smith");

        WebElement radioFemale = driver.findElement(By.cssSelector("input[value='Female']"));
        radioFemale.click();

        WebElement radioYearsOfExperience = driver.findElement(By.cssSelector("input[value='2']"));
        radioYearsOfExperience.click();

        WebElement dateField = driver.findElement(By.cssSelector("tr:nth-child(5)>td:nth-child(2) >input"));
        dateField.sendKeys("01/18/1985");

        WebElement manualCheckbox = driver.findElement(By.cssSelector("input[value='Manual Tester']"));
        manualCheckbox.click();

        WebElement autoCheckbox = driver.findElement(By.cssSelector("input[value='Automation Tester']"));
        autoCheckbox.click();

        WebElement picture = driver.findElement(By.name("photo"));
        picture.sendKeys("/Users/spirituos0/Desktop/Thinking-of-getting-a-cat.png");

        WebElement seleniumCheckbox = driver.findElement(By.cssSelector("input[value='Selenium Webdriver']"));
        seleniumCheckbox.click();

        WebElement continentsDropdown = driver.findElement(By.name("continents"));
        Select selectContinent = new Select(continentsDropdown);
        selectContinent.selectByVisibleText("North America");

        WebElement commandsMulti = driver.findElement(By.name("selenium_commands"));
        Select selectCommands = new Select(commandsMulti);
        selectCommands.selectByVisibleText("Browser Commands");
        selectCommands.selectByVisibleText("Switch Commands");
        selectCommands.selectByVisibleText("WebElement Commands");

        String button = driver.findElement(By.cssSelector("button[name='submit']")).getText();
        System.out.println(button);

        driver.quit();


    }
}
