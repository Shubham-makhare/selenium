
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class Googlecopy {
		public static void main(String[] args) throws InterruptedException, AWTException {
	        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.co.in/");
	        Thread.sleep(2000);
	        WebElement searchBox=driver.findElement(By.name("q")); //goes to search box
		       boolean dis = searchBox.isDisplayed();
		       System.out.println(dis);
		       searchBox.sendKeys("java",Keys.ENTER);
		       Actions a= new Actions(driver);
		       WebElement doubleClick=driver.findElement(By.xpath("//*[@class='qrShPb kno-ecr-pt PZPZlf q8U8x']"));
		       a.doubleClick(doubleClick).perform();
		       Robot r = new Robot();
		       r.keyPress(KeyEvent.VK_CONTROL);
		       r.keyPress(KeyEvent.VK_C);
		        r.keyPress(KeyEvent.VK_CONTROL);
		        Thread.sleep(4000);
		        r.keyPress(KeyEvent.VK_T);
		        r.keyPress(KeyEvent.VK_V);
		        r.keyPress(KeyEvent.VK_ENTER);
		        
		        
		   }
	   }
	   


