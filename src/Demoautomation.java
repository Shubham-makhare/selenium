import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoautomation {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        Thread.sleep(2000);
        
        WebElement username=(WebElement) driver.findElement(By.id("username"));
		username.sendKeys("admin");	
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		     
	}
}