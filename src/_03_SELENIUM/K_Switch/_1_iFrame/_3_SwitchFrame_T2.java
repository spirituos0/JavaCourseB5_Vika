package _03_SELENIUM.K_Switch._1_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class _3_SwitchFrame_T2 {

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
        System.out.println("clicked to addToCart_eBook");

        WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(iFrame));
        driver.switchTo().frame(iFrame);
        System.out.println("switched to iframe");

        WebElement cartItems = driver.findElement(By.xpath("//div[@class='Fixed-Actions Desktop-Only']//span"));
        String cartItemsText = cartItems.getText();
        System.out.println("i have " + cartItemsText + " items");
        boolean oneItem = cartItemsText.equals("1");

        if (oneItem)
            System.out.println("There is " + cartItemsText + " item in the cart.");
        else
            System.out.println("Fail");

        WebElement remove = driver.findElement(By.xpath("//button[@class='Product-Remove']"));
        wait.until(ExpectedConditions.elementToBeClickable(remove));
        remove.click();
        wait.until(ExpectedConditions.invisibilityOf(remove));
        System.out.println("clicked to remove");

        WebElement continueShopping = driver.findElement(By.xpath("//button[@class='Continue-Button Close-Cart']"));
        wait.until(ExpectedConditions.elementToBeClickable(continueShopping));
        continueShopping.click();
        System.out.println("clicked continue");

        driver.switchTo().defaultContent();
        System.out.println("switched back to iframe");

        WebElement cartItemsAfterRemoving = driver.findElement(By.xpath("//a[@class='navbar-item cart']//span"));
        String cartItemsAfterRemovingText = cartItemsAfterRemoving.getText();
        System.out.println("i have " + cartItemsAfterRemovingText + " in my cart");
        boolean zeroItems = cartItemsAfterRemovingText.equals("0");

        if (zeroItems)
            System.out.println("There is " + cartItemsAfterRemovingText + " item in the cart.");
        else
            System.out.println("Fail");

        driver.quit();
    }
}
