package _03_SELENIUM.K_Switch._3_MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _3_MultipleWindows {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://techno.study/");

        List<String> windowHandlesList = new ArrayList<>();

        windowHandlesList.add(driver.getWindowHandle());

        WebElement freeConsultation = driver.findElement(By.xpath("//div[@class='t228__right_buttons_but']//a"));
        freeConsultation.click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!windowHandlesList.contains(handle))
                windowHandlesList.add(handle);
        }

        WebElement enrollNowBtn = driver.findElement(By.xpath("(//div[@class='t228__right_buttons_but'])//a[2]"));
        enrollNowBtn.click();

        Set<String> windowHandles2 = driver.getWindowHandles();
        for (String handle : windowHandles2) {
            if (!windowHandlesList.contains(handle))
                windowHandlesList.add(handle);
        }

        // switch to 3rd window
        driver.switchTo().window(windowHandlesList.get(2));
        // switch back to 1st
        driver.switchTo().window(windowHandlesList.get(0));
        // switch to 2nd
        driver.switchTo().window(windowHandlesList.get(1));

        // All handles are unique strings , that have unique id.
        // That way selenium understands which window to navigate to.
        // Here is for loop just as example of handles with these ids.
        for (String str : windowHandlesList) {
            System.out.println(str);
        }



    }
}
