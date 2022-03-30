package _03_SELENIUM.K_Switch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _2_NewWindow {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://techno.study/");


        // we make this method to be able to switch back to original window later:
        // Get the original window handle (parent window handle) so we can switch back easily!
        String originalWindowHandle = driver.getWindowHandle();

        WebElement freeConsultation = driver.findElement(By.xpath("//div[@class='t228__right_buttons_but']//td"));
        freeConsultation.click();

        // Get all window handles and using for each loop switch to another window
        // to switch to another window, we need to do this:
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }

        // before switching back wwe should close current window:
        driver.close();

        WebElement inputEmail = driver.findElement(By.xpath("(//input[@name='Email'])[3]"));
        inputEmail.sendKeys("test@test.com");

        WebElement phoneInput = driver.findElement(By.xpath("//input[@name='tildaspec-phone-part[]']"));
        phoneInput.sendKeys("1231434443");

        // now we switch back to original window:
        driver.switchTo().window(originalWindowHandle);

        WebElement sdetCourseButton = driver.findElement(By.xpath("//a[text()='SDET course']"));
        sdetCourseButton.click();


        
    }
}
