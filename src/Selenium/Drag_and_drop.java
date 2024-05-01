package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args)
	throws  InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        
        WebElement PM =driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(PM);
        Thread.sleep(2000);
        
        WebElement P =driver.findElement(By.xpath("//ul[@id='gallery']//li[4]"));
        WebElement Q =driver.findElement(By.xpath("//div[@id='trash']"));
        Actions a=new Actions(driver);
        a.dragAndDrop(P,Q).perform();

	}

}
