package Selenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args)
		throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    TakesScreenshot TS= (TakesScreenshot)driver;
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);
        WebElement UN= driver.findElement(By.xpath("//input[@name='username']"));
        WebElement PD= driver.findElement(By.xpath("//input[@name='password']"));
        UN.sendKeys("Admin");
        PD.sendKeys("admin123");

        Thread.sleep(2000);
        WebElement Log= driver.findElement(By.xpath("//button[@type='submit']"));
        File src= TS.getScreenshotAs(OutputType.FILE);
        File Des= new File("C:\\document\\New folder\\screen1.png");
        FileUtils.copyFile(src, Des);
        Log.click();
 
        Thread.sleep(5000);
        File src1= TS.getScreenshotAs(OutputType.FILE);
        File Des1= new File("C:\\document\\New folder\\screen2.png");
        FileUtils.copyFile(src1, Des1);

        Thread.sleep(2000);        
        WebElement Buzz= driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
        Buzz.click();       
      
        Thread.sleep(2000);
        WebElement EnterText= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
        EnterText.click();
        EnterText.sendKeys("SHIVANI CHAUDHARY");
        
        Thread.sleep(1000);
        File src2= TS.getScreenshotAs(OutputType.FILE);
        File Des2= new File("C:\\document\\New folder\\screen3.png");
        FileUtils.copyFile(src2, Des2);
        
        WebElement Post= driver.findElement(By.xpath("//button[@type='submit']"));
        Post.click(); 
        
        Thread.sleep(2000);
        File src3= TS.getScreenshotAs(OutputType.FILE);
        File Des3= new File("C:\\document\\New folder\\screen4.png");
        FileUtils.copyFile(src3, Des3);
        

	}

}
