package _03_SELENIUM.I_XPath._01_LocatingTheElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_TextExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        WebElement textStartsWith = driver.findElement(By.xpath("//a[starts-with(text(),'Mobile')]"));
        System.out.println("Whole text that starts with 'Mobile': " + textStartsWith.getText());

        WebElement thirdElement = driver.findElement(By.xpath("(//a[text()='SDET course'])[3]"));
        System.out.println("We located third element: " + thirdElement.getText());

        driver.quit();

    }
}
