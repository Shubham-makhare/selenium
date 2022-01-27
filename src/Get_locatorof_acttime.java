import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Get_locatorof_acttime {
		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.actitime.com/login.do");
	        Thread.sleep(2000);
           WebElement kpl =driver.findElement(By.id("keepLoggedInCheckBox"));
           kpl.click();
           Point loc =kpl.getLocation();
           System.out.println(loc);
           System.out.println("x:"+loc.getX()+"    y:"+ loc.getY());
           
	}

}
