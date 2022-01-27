
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Fb_new_1 {
		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(2000);
	         driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	         Thread.sleep(2000);
	         WebElement male = driver.findElement(By.xpath("//*[@type='radio' and @value='2']"));
	         male.click();
	         System.out.println(male.isSelected());
	        Thread.sleep(5000);
	        driver.close();

		}

	}



