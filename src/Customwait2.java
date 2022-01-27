import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customwait2 {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("file:///C:/Users/Admin/AppData/Local/Temp/Temp1_WebDriverWait%20Examples.zip/WebDriverWait%20Examples/sam1.html");
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.findElement(By.xpath("//*[@ name='textA']")).sendKeys("name");
           Thread.sleep(2000);
         System.out.println(driver.findElement(By.xpath("//*[@name='textA']")).getAttribute("Value"));
         
           WebDriverWait ww= new WebDriverWait(driver,Duration.ofSeconds(10));
           ww.until(new ExpectedCondition<Boolean>() {
        	   public Boolean apply(WebDriver d) {
        		   WebElement ele= d.findElement(By.xpath("//*[@name='textA']"));
        		   return ele.getAttribute("Value").equalsIgnoreCase("name");
        		   
        	   }
           });
           driver.findElement(By.xpath("//*[@name='textB']")).sendKeys("makhare");
           
	}


}
