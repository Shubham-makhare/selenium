import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_by_aninomous {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait ww= new WebDriverWait(driver,Duration.ofSeconds(10));
        ww.until(new ExpectedCondition<Boolean>() {
        	public Boolean apply(WebDriver driver) {
        		WebElement cna= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        		return cna.isDisplayed();
        	}
        });
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        	
        }

}
