import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_signup {

		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(2000);
	        
	        WebElement title = driver.findElement(By.tagName("title"));
	        
	        System.out.println("webpage Title :" + title.getAttribute("text"));
	        driver.close();
	        
	        
	        

	}

}
