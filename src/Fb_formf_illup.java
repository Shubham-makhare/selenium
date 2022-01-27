import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_formf_illup {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement fb = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        fb.click();
        fb.findElement(By.xpath("//input[@name='firstname']" )).click();
        driver.findElement(By.xpath("//input[@name='lastname']")).click();
        driver.findElement(By.xpath("//input[@id='u_0_o_bF']")).click();
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).click();
        driver.findElement(By.xpath("//label[contains(.,'Male')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='u_3_5_vQ']")).click();
        driver.close();

	}

}
