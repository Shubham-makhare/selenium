import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder1 {



	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.urbanladder.com/");
	        Thread.sleep(2000);
	        List<WebElement> menus=driver.findElements(By.xpath("//UL[@class='topnav bodytext']/li"));
	        Actions a= new Actions(driver);
	        for (WebElement menu : menus) {
	        	System.out.println(menu.getText());
	        	a.moveToElement(menu).perform();
	        	Thread.sleep(5000);
	        	driver.close();
	        }
				
			}
}
