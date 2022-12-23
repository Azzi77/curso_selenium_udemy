import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class TesteCadastro {
	@Test
	public void deveInteragirComPrompt() {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Regina" + Keys.ENTER);
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Azzi");
		driver.findElement(By.id("elementosForm:sexo:1")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		
		new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Mestrado");
		new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");
		
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		Assert.assertTrue("Regina", driver.findElement(By.id("descNome")).getText().endsWith("Regina"));
		Assert.assertEquals("Sobrenome: Azzi", driver.findElement(By.id("descSobrenome")).getText());
		Assert.assertEquals("Sexo: Feminino", driver.findElement(By.id("descSexo")).getText());
		Assert.assertEquals("Comida: Pizza", driver.findElement(By.id("descComida")).getText());
		Assert.assertEquals("Escolaridade: mestrado", driver.findElement(By.id("descEscolaridade")).getText());
		Assert.assertEquals("Esportes: Corrida", driver.findElement(By.id("descEsportes")).getText());
		
		driver.quit();
		
		
		
		
		
		
		
		
		

}
}

