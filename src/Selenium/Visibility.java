package Selenium;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visibility {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement UN= driver.findElement(By.xpath("//input[@name='username']"));
        WebElement PD= driver.findElement(By.xpath("//input[@name='password']"));
        UN.sendKeys("Admin");
        PD.sendKeys("admin123");
        WebElement Log= driver.findElement(By.xpath("//button[@type='submit']"));
//        Boolean a,b;  
//        a=Log.isDisplayed();
//        b=Log.isEnabled();
//        System.out.print(a+ " and " +b);
        if(Log.isDisplayed() && Log.isEnabled())
        Log.click();   
        Thread.sleep(2000);
        WebElement Myinfo=driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
        Myinfo.click();
        Thread.sleep(2000);
        WebElement male=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        if(male.isSelected()==false) {
//        	male.click();
        	driver.findElement(By.xpath("//label[normalize-space()='Female']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")).click();
        	driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")).click();
        }
//        driver.quit();
	}}


