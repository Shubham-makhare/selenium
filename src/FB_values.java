import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_values {
		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	        Thread.sleep(2000);
	          
	        WebElement day = driver.findElement(By.id("day"));
	        Select sday = new Select(day);
	       // sday.selectByValue("9");
	        sday.selectByVisibleText("9");
	       // sday.deselectByIndex(9);
	        
	        List<WebElement> opts = sday.getOptions();
	        for (WebElement opt : opts) {
				System.out.println(opt.getText());
			}

	}

}
