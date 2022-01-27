
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class BlueStone_goldcoin {

			public static void main(String[] args) throws InterruptedException {
		        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		        WebDriver  driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get(" https://www.google.com/");
		        Thread.sleep(2000);
		        WebElement searchBox=driver.findElement(By.name("q"));
			       boolean dis = searchBox.isDisplayed();
			       System.out.println(dis);
			       searchBox.sendKeys("www.bluestone.com");
			       Thread.sleep(2000);
			       List<WebElement>sugg = driver.findElements(By.xpath("//a[contains(.,'All Jewellery')]"));
	              Thread.sleep(3000);
	              for (WebElement sugges : sugg)
	              {
	            	  System.out.println(sugges.getText());
	            	  Thread.sleep(5000);
	            	  sugg.get(3).click();
					
				}

		}

	}


