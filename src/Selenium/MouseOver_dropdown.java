package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_dropdown {

	public static void main(String[] args)
    throws  InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("https://uncodemy.com");
        Thread.sleep(2000);
        WebElement Catagories =driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
	   	Actions a=new Actions(driver);
	   	a.moveToElement(Catagories).perform();
		
	    WebElement SoftwareTesting =driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
		a.moveToElement(SoftwareTesting).perform();
			
	    WebElement ManualTesting =driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']"));
	    ManualTesting.click();
		
	}

}
