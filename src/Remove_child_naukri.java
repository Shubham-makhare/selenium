

	import java.util.Set;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Remove_child_naukri {

		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://naukri.com/");
	       Thread.sleep(2000);
	       
	       String parentWH = driver.getWindowHandle();
		System.out.println("parent window handled"+ parentWH);
		Set<String> wins = driver .getWindowHandles();
		wins.remove(parentWH);
	       System.out.println(wins.getClass());
	       for (String handle : wins) {
	    	   System.out.println(handle);
	    	   driver.switchTo().window(handle);
	    	   driver.close();
	    	   Thread.sleep(2000);
			
		}
	   
	       
}
}

