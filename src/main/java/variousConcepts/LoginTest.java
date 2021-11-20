package variousConcepts;

 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	
	  WebDriver driver;  //we created a global variable. so we can use it for all methods in our class.
	@Before
	 public void init() throws InterruptedException  {
	

//   different ways to set property
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shukl\\July2021_selenium\\Session1\\driver\\chromedriver.exe");
	   //	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	  	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
	//System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test
public  void loginTest() throws InterruptedException {
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("Login")).click();
	Thread.sleep(3000);
}
	@After
public  void tearDown()  {
	driver.close();
}
}
