import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.urbanladder.com/");
	        Thread.sleep(2000);
	}

}
