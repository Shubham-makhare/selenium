
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Shubham {

		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	        WebDriver  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.youtube.com/");  //goes to google
	        Thread.sleep(2000);
	        WebElement searchBox=driver.findElement(By.name("//*[@id='search' and @name='search_query']")); //goes to search box
		       boolean dis = searchBox.isDisplayed();
		       System.out.println(dis);
		       searchBox.sendKeys("somebody me");  //search sselenium
		       Thread.sleep(2000);
		       List<WebElement>sugg = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li")); //third elements
              Thread.sleep(2000);
              for (WebElement sugges : sugg) {
            	  System.out.println(sugges.getText());
            	  Thread.sleep(3000);
            	  sugg.get(3).click();
				
			}

	}

}
