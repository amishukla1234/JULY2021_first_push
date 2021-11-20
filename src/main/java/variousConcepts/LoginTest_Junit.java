package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest_Junit {
	
	WebDriver driver;	
@Before	
public  void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://techfios.com/billing/?ng=admin/");
}

@Test
public  void loginTest() throws InterruptedException {
	
	//  identify elements
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	
}	


	@After
public  void tearDown() {
	driver.close();
}

}
