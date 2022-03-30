package _03_SELENIUM.K_Switch.HomeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Scenario4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addToCart_eBook = driver.findElement(By.xpath("//h4[text()='Demo eBook']/following-sibling::button"));
        addToCart_eBook.click();

        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(iframe1));
        driver.switchTo().frame(iframe1);

        WebElement payWithCC = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        payWithCC.click();

        WebElement emailInput = driver.findElement(By.xpath("//p[@class='Billing-Email Inline MarginRight']//input"));
        emailInput.sendKeys("antonio.g@test.com");

        WebElement confirmEmail = driver.findElement(By.xpath("//p[@class='Billing-Email-Confirm Inline']//input"));
        confirmEmail.sendKeys("antonio.g@test.com");

        WebElement nameOnCardInput = driver.findElement(By.xpath("//input[@placeholder='Name On Card']"));
        nameOnCardInput.sendKeys("Antonio Gonzalez");

        WebElement phoneInput = driver.findElement(By.xpath("//p[@class='Billing-Phone Inline']//input"));
        phoneInput.sendKeys("5712341243");

        WebElement companyInput = driver.findElement(By.xpath("//p[@class='Billing-Company']//input"));
        companyInput.sendKeys("Dylan's Movers");

        WebElement iframe2 = driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));
        driver.switchTo().frame(iframe2);

        WebElement cardNumberInput = driver.findElement(By.xpath("//div[@class='CardNumberField-input-wrapper']//input"));
        wait.until(ExpectedConditions.visibilityOf(cardNumberInput));
        cardNumberInput.sendKeys("4242424242424242");

        WebElement mmyyInput = driver.findElement(By.xpath("//span[@data-max='MM / YY0']//input"));
        mmyyInput.sendKeys("1222");

        WebElement cvcInput = driver.findElement(By.xpath("//span[@class='CardField-cvc CardField-child']//input"));
        cvcInput.sendKeys("000");

        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.visibilityOf(iframe1));
        driver.switchTo().frame(iframe1);

        WebElement payBtn = driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        payBtn.click();

        wait.until(ExpectedConditions.invisibilityOf(payBtn));
        wait.until(ExpectedConditions.titleContains("E-junkie - Thank you"));

        WebElement confirmation = driver.findElement(By.xpath("//p[@class='confirme_text']//span"));
        String confirmationText = confirmation.getText();
        System.out.println(confirmationText);

        driver.quit();
    }
}
