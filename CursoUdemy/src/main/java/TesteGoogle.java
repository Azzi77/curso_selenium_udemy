import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteGoogle {
	
	@Test
	
	public void teste() {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		
		driver.quit();
		
		
	}

}
