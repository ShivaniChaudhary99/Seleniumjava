package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method {
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	void navigate() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        Thread.sleep(2000);    
	}
    
	void login() throws InterruptedException {
		WebElement UN= driver.findElement(By.xpath("//input[@name='username']"));
        WebElement PD= driver.findElement(By.xpath("//input[@name='password']"));
        UN.sendKeys("Admin");
        PD.sendKeys("admin123");
        WebElement Log= driver.findElement(By.xpath("//button[@type='submit']"));
        Log.click();
      Thread.sleep(2000);        
	}
	void post() throws InterruptedException {
		 WebElement Buzz= driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
         Buzz.click();
         Thread.sleep(2000);
         WebElement EnterText= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
//         EnterText.click();
         EnterText.sendKeys("SHIVANI CHAUDHARY");
         WebElement Post= driver.findElement(By.xpath("//button[@type='submit']"));
         Post.click();     
	}
}
