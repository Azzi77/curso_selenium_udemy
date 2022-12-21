
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoTreinamento {
	
	
@Test
	
	public void testeTextField() {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		
		 driver.findElement(By.id("elementosForm:nome")).sendKeys("teste de escrita");
		
		 Assert.assertEquals("teste de escrita", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		 
		driver.quit();
		
}
@Test
 public void deveInteragirComTextArea() {
	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("escrita");
	
	Assert.assertEquals("escrita", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
	driver.quit();
	
}



}
