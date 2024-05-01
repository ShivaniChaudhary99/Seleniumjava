package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
     
        WebElement UN= driver.findElement(By.xpath("//input[@name='username']"));
        WebElement PD= driver.findElement(By.xpath("//input[@name='password']"));
        UN.sendKeys("Admin");
        PD.sendKeys("admin123");
        WebElement Log= driver.findElement(By.xpath("//button[@type='submit']"));
        Log.click();
        Thread.sleep(5000);
        driver.navigate().refresh();
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        

	}

}
