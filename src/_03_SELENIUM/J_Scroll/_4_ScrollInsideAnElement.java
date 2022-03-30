package _03_SELENIUM.J_Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _4_ScrollInsideAnElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://ressio.github.io/lazy-load-xt/demo/horizontal.htm");

        WebElement divWrapper = driver.findElement(By.className("wrapper"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scroll horizontally to right inside the divWrapper element.
        // if we want to scroll horizontally inside a website only, then we don't have to provide an element in ()
        js.executeScript("arguments[0].scrollBy(500,0)", divWrapper);

    }
}
