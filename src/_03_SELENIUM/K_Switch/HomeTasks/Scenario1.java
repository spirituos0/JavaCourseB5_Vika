package _03_SELENIUM.K_Switch.HomeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Scenario1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://shopdemo.e-junkie.com/");

        // following sibling method:
        WebElement addToCart_eBook = driver.findElement(By.xpath("//h4[text()='Demo eBook']/following-sibling::button"));
        addToCart_eBook.click();

        WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(iFrame));
        driver.switchTo().frame(iFrame);

        WebElement addPromoCodeBtn = driver.findElement(By.xpath("//button[@class='Apply-Button Show-Promo-Code-Button']"));
        addPromoCodeBtn.click();

        WebElement promoCodeInput = driver.findElement(By.xpath("//input[@class='Promo-Code-Value']"));
//        wait.until(ExpectedConditions.visibilityOf(promoCodeInput));
        promoCodeInput.sendKeys("123456789");

        WebElement applyBtn = driver.findElement(By.xpath("//button[@class='Promo-Apply']"));
        applyBtn.click();

        WebElement invalidPromo = driver.findElement(By.xpath("//span[contains(text(), 'Invalid promo code')]"));
        String invalidPromoText = invalidPromo.getText();
        System.out.println(invalidPromoText);

        driver.quit();
    }
}
