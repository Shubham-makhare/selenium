import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AActitime {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("pwd")).sendKeys("manager",Keys.ENTER);
        
   
        
        Thread.sleep(2000);

}
}
