package _03_SELENIUM.K_Switch.HomeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Scenario3 {

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

        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(iframe1));
        driver.switchTo().frame(iframe1);
        System.out.println("switched to 1st iframe");

        WebElement payWithCC = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        payWithCC.click();
        System.out.println("clicked pay with card");

        WebElement iframe2 = driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));
        driver.switchTo().frame(iframe2);
        System.out.println("switched to 2nd iframe");

        WebElement cardNumberInput = driver.findElement(By.xpath("//div[@class='CardNumberField-input-wrapper']//input"));
        wait.until(ExpectedConditions.visibilityOf(cardNumberInput));
        cardNumberInput.sendKeys("1111 1111 1111 1111");
        System.out.println("sent keys card number");

        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.visibilityOf(iframe1));
        driver.switchTo().frame(iframe1);
        System.out.println("switched to 1st iframe");

        WebElement invalidCardNumber = driver.findElement(By.xpath("//div[@id='SnackBar']//span"));
        String invalidCardNumberText = invalidCardNumber.getText();
        System.out.println(invalidCardNumberText);

        driver.quit();
    }
}
