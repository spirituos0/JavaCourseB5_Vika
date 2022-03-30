package _03_SELENIUM.I_XPath._01_LocatingTheElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/spirituos0/Desktop/IT course/drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://campus.techno.study/");

    }
}
