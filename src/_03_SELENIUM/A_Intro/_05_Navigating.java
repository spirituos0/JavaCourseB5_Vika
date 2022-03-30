package _03_SELENIUM.A_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Navigating {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

//        driver.navigate().to("https://www.google.com/");
        // navigate().to method will open a website, but it's not gonna wait till it's loaded
        // that's why we are gonna use get() method to be able to load the page and THEN perform further actions

        driver.get("https://www.google.com/"); // get() method will wait until website is loaded

        Thread.sleep(3000); // this step forces Selenium to wait for 3000 milliseconds = 3 seconds

        driver.get("https://www.facebook.com");

        Thread.sleep(3000);

        // navigate().back() will navigate to previous page
        driver.navigate().back(); // it navigates to google, then to facebook and the to google

        Thread.sleep(3000);

        // navigate().forward() navigates to forward page
        driver.navigate().forward();

        Thread.sleep(3000);

        // refreshing the page
        driver.navigate().refresh();


    }
}
