package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        String Title= driver.getTitle();
        System.out.println(Title);
        String URL= driver.getCurrentUrl();
        System.out.println(URL);
        WebElement UN= driver.findElement(By.xpath("//input[@name='username']"));
        WebElement PD= driver.findElement(By.xpath("//input[@name='password']"));
        UN.sendKeys("Admin");
        PD.sendKeys("admin123");
        WebElement Log= driver.findElement(By.xpath("//button[@type='submit']"));
        Log.click();
//        Thread.sleep(2000);
        
        WebElement Buzz= driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
        Buzz.click();
//        Thread.sleep(2000);
        WebElement EnterText= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));

        EnterText.sendKeys("SHIVANI CHAUDHARY");
        WebElement Post= driver.findElement(By.xpath("//button[@type='submit']"));
        Post.click();     

	}

}

