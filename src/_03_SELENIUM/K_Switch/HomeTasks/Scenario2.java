package _03_SELENIUM.K_Switch.HomeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Scenario2 {

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

        WebElement payWithCC = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        payWithCC.click();

        WebElement payBtn = driver.findElement(By.xpath("//div[@class='Checkout-Options']//button[@class='Pay-Button']"));
        wait.until(ExpectedConditions.visibilityOf(payBtn));
        payBtn.click();

        WebElement invalidInfo = driver.findElement(By.xpath("//div[@id='SnackBar']//span"));
        String invalidInfoText = invalidInfo.getText();
        System.out.println(invalidInfoText);

        driver.quit();

    }
}
