package SatProjects.Week_11_Jan22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Part3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.snapdeal.com/");

        WebElement searchTeddyBear = driver.findElement(By.xpath("//div[@class='header_wrapper']//input[@name='keyword']"));
        searchTeddyBear.sendKeys("teddy bear");
        WebElement searchButton = driver.findElement(By.xpath("//div[@class='header_wrapper']//span[@class='searchTextSpan']"));
        searchButton.click();

        WebElement searchResult = driver.findElement(By.cssSelector("#searchMessageContainer"));
        System.out.println(searchResult.getText());


        System.out.println("Search result URL: " + driver.getCurrentUrl());

        WebElement snapdealLogo = driver.findElement(By.xpath("//a[@class='notIeLogoHeader hashAdded']"));
        snapdealLogo.click();

        System.out.println("Homepage URL: " + driver.getCurrentUrl());

        driver.navigate().back();

        WebElement inputTeddyBear = driver.findElement(By.xpath("//div[@class='header_wrapper']//input[@value='teddy bear']"));
        String valueIsTeddyBear = inputTeddyBear.getAttribute("value");
        System.out.println(valueIsTeddyBear);
        boolean valueIsEqualToTeddyBear = valueIsTeddyBear.equals("teddy bear");

        if (valueIsEqualToTeddyBear)
            System.out.println("Input contains \"" + valueIsTeddyBear + "\"" + ": " + valueIsEqualToTeddyBear);
        else
            System.out.println("Input does not contain \"" + valueIsTeddyBear + "\".");

        driver.quit();
    }
}
