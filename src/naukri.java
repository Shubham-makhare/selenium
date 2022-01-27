
	import java.util.Set;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class naukri {
		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://naukri.com/");
	       Thread.sleep(2000);
	       Set<String> wins =driver.getWindowHandles();
	       System.out.println(wins.getClass());
	       for (String handle : wins) {
	    	   System.out.println(handle);
	    	   driver.switchTo().window(handle);
	    	   driver.close();
	    	   Thread.sleep(2000);
			
		}
	   
	       
}
}