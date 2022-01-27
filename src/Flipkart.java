import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {


		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		        WebDriver  driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.flipkart.com/");
		        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		        Thread.sleep(2000);
		        WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
	
			       boolean dis = searchBox.isDisplayed();
			       System.out.println(dis);
			       searchBox.sendKeys("macbook air",Keys.ENTER);
			       Thread.sleep(2000);
			       driver.findElement(By.xpath("//div[contains(.,'APPLE MacBook Air M1 - (8 GB/512 GB SSD/Mac OS Big Sur) MGN73HN/A')]/div[@class='_4rR01T']")).click();
			       Thread.sleep(2000);
			       Set<String> allWindows =driver.getWindowHandles();			       
			       //allWindows.remove(driver.getWindowHandle());
			       
			       ArrayList<String> alwin = new ArrayList<>(allWindows);
			       driver.switchTo().window(alwin.get(1));
			       
			       
			       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			       Thread.sleep(2000);
			       
			       
			       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL'")).click();
			       Thread.sleep(2000);
			       
			       
			       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shubham.makhare@gmail.com",Keys.ENTER);
			       Thread.sleep(5000);
			       
			       driver.close();
			       
			       
			       
			       
			       
		}

			
		}
	

	


