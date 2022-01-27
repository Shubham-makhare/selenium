
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class Bluestone3 {
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		        WebDriver  driver = new ChromeDriver();		      
		        driver.get("https://www.bluestone.com/");
		        driver.manage().window().maximize();
		        Thread.sleep(2000);
		      List<WebElement> menus =driver.findElements(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[6]"));
		        Actions a= new Actions(driver);
		        Thread.sleep(6000);
		        for (WebElement menu : menus)
		        {
		        	Thread.sleep(4000);
		        	a.moveToElement(menu).perform();
 		          System.out.println(menu.getText());
					
				}
	}
	}


