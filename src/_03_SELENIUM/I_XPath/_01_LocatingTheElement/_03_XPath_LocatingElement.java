package _03_SELENIUM.I_XPath._01_LocatingTheElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

public class _03_XPath_LocatingElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        // locate element by using text
        WebElement locateText = driver.findElement(By.xpath("//p[text()='Learn skills to launch a tech career in 6 months']"));
        String locateTextText = locateText.getText();
        System.out.println(locateTextText);

        // Locating elements by using element contains method
        WebElement textContains = driver.findElement(By.xpath("//p[contains(text(),'mentorship')]"));
        String textContainsText = textContains.getText();
        System.out.println(textContainsText);

        // In XPath we can move from child to parent using /..
        WebElement divElement = driver.findElement(By.xpath("//input[@name='Email']/.."));
        String divElementAttribute = divElement.getAttribute("class");

        // Locating element by index
        // when your locator finds more than 1 element, you can use index to select a specific one
        WebElement sdetCourseLink = driver.findElement(By.xpath("(//a[text()='SDET course'])[3]"));
        sdetCourseLink.click();

        driver.quit();
    }
}
