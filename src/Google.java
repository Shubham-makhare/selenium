import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.google.com/search?gs_ssp=eJzj4tTP1TcwMU02T1JgNGB0YPBiS8_PT89JBQBASQXT&q=google&rlz=1C1RXQR_enIN962IN962&oq=goo&aqs=chrome.2.69i57j35i39j46i131i199i433i465i512j0i131i433i512j0i433i512j0i131i433i512j0i433i512l4.6309j0j15&sourceid=chrome&ie=UTF-8");
        String title =driver.getTitle();
        System.out.println(title); // title
       
        System.out.println(driver.getCurrentUrl()); // to fetch the title of current page
        Thread.sleep(2000);
        
             driver.close();
       
	}
}
