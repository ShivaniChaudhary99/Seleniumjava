package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args)
	throws  InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
         WebElement insta= driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
       insta.click();     
         String PID= driver.getWindowHandle();
         Set<String>abc=driver.getWindowHandles();
         System.out.println(PID);
         System.out.println(abc);
      for(String A:abc) {
    	  if(!(PID.equals(A)))  
    	  {
    		  driver.switchTo().window(A);
    	        }}
    	  WebElement UN= driver.findElement(By.xpath("//input[@name='username']"));
    	  UN.sendKeys("8004624681");
	}
	}
