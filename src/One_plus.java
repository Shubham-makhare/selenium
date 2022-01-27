

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One_plus {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        Thread.sleep(1000);
        WebElement searchBox=driver.findElement(By.name("q")); //goes to search box
	       boolean dis = searchBox.isDisplayed();
	       System.out.println(dis);
	       searchBox.sendKeys("one plus",Keys.ENTER);
	       
	       WebElement next=driver.findElement(By.xpath("//*[@style='display:block;margin-left:53px']"));
	       for (int i = 1; i > 0;) {
	    	   if(next.isDisplayed()) {
	    		   next.click();
	    	   }
			Thread.sleep(5000);
			driver.close();
		}
	       

}
}