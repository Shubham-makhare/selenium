import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	 
	public static void main(String[] args) throws InterruptedException {
		           System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		           WebDriver  driver = new ChromeDriver();
		           driver.manage().window().maximize();
		           driver.get("https://www.marriott.com/hotels/travel/pnqmc-jw-marriott-hotel-pune/");
		           driver.get("https://www.instagram.com/");
		           Thread.sleep(2000);
		           driver.navigate().back();
		           Thread.sleep(2000);
		           driver.navigate().forward();
		           Thread.sleep(2000);
		           driver.navigate().refresh();
		           
		          driver.close();
		           driver.quit();
	               
	}

}
