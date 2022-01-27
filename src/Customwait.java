import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customwait {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("file:///C:/Users/Admin/AppData/Local/Temp/Temp1_WebDriverWait%20Examples.zip/WebDriverWait%20Examples/VisibilityOfTextbox.html");
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           WebDriverWait ww= new WebDriverWait(driver,Duration.ofSeconds(10));
           ww.until(new ExpectedCondition<Boolean>() {
        	   public Boolean apply(WebDriver d) {
        		   WebElement ele= d.findElement(By.id("iamtextbox"));
        		   return ele.isDisplayed();
        		   
        	   }
           });
           driver.findElement(By.id("iamtextbox")).sendKeys("shubham");
	}
}