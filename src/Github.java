import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://github.com/login");
	        Thread.sleep(2000);
	        String title =driver.getTitle();
	        
	        WebElement username=(WebElement) driver.findElement(By.id("login_field"));
			username.sendKeys("Shubham-makhare");	
			
			
	        WebElement username2=(WebElement) driver.findElement(By.id("password"));
			username2.sendKeys("Makhare@7003",Keys.ENTER);
			
			 String title2 =driver.getTitle();
			if(title==title2)
			{
				System.out.println("page not displayed");
			}
			else
			{
				System.out.println("page displayed successfully");
			}
	}

}
