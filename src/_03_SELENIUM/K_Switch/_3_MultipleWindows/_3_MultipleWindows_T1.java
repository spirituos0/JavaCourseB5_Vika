package _03_SELENIUM.K_Switch._3_MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _3_MultipleWindows_T1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        String originalWindowHandle = driver.getWindowHandle();

        WebElement facebook = driver.findElement(By.xpath("(//div[@class='t228__right_social_links_item'])[1]//a"));
        facebook.click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }

        System.out.println("New Window URL: " + driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(originalWindowHandle);

        String originalURL = driver.getCurrentUrl();
        System.out.println("Parent URL: " + originalURL);

        driver.quit();

    }
}

