
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

	public class Implicit_enter_title_matching {
		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.actitime.com/login.do");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.findElement(By.id("username")).sendKeys("admin");
	        
	        driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	        WebDriverWait ww = new WebDriverWait(driver,Duration.ofSeconds(10));
	        ww.until(ExpectedConditions.titleContains("Enter"));
	        driver.findElement(By.id("logoutLink")).click();
	        

	}
	}


