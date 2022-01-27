import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		        WebDriver  driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.google.com/");
		        Thread.sleep(2000);
		        String title =driver.getTitle();

		        WebElement input= driver.findElement(By.name("q"));
				input.sendKeys("who is ceo of google",Keys.ENTER);	
                  
				input.click();
				 String title2 =driver.getTitle();
				if(title==title2)
				{
					System.out.println("page not displayed");
				}
				else
				{
					System.out.println("page displayed successfully");
				}    
				
	}

}
