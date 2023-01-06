//import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PortoSeguro {
@Test
	
	public void cookiesPrivacidade() {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.portoseguro.com.br/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		//driver.quit();

}
}

