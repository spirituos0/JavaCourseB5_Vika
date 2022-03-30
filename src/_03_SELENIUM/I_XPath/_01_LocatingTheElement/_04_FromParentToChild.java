package _03_SELENIUM.I_XPath._01_LocatingTheElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _04_FromParentToChild {

    public static void main(String[] args) {

        /*
        // -> from parent to child
        /.. -> from child to parent
         */
        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://facebook.com/");

        // double slash helps to move from parent to child:
        // 2 sets:
        WebElement firstNameFromParentToChild = driver.findElement(By.xpath("//div[@id='u_4_a_4t']//input"));
        firstNameFromParentToChild.sendKeys("Vika");

        // 3 sets:
        WebElement passwordFromParentToChild = driver.findElement(By.xpath("//div[@id='u_4_k_Mg']//div//input"));
        passwordFromParentToChild.sendKeys("dja234iauJHS");

        WebElement loginButtonFromChildToParent = driver.findElement(By.xpath("button[@name='login']/.."));
        loginButtonFromChildToParent.click();

    }
}
