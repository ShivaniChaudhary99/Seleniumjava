package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert1 {

	public static void main(String[] args) 
	throws  InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         driver.get("https://demo.automationtesting.in/Alerts.html");
         Thread.sleep(2000);
        
//         driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//         Thread.sleep(2000);
//         Alert a= driver.switchTo().alert();
//         a.accept();
       
//         driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
//         Thread.sleep(2000);
//         driver.switchTo().alert().accept();
//         driver.switchTo().alert().dismiss();
         
         driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
         Thread.sleep(2000);
         Alert a=driver.switchTo().alert();
         a.sendKeys("SHIVANI");
         a.accept();    
//         driver.switchTo().alert().dismiss();
           
//        driver.quit();
	}
}
