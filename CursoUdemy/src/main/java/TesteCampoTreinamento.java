
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

@Test

public void deveInteragirComRadioButton() {
	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	driver.findElement(By.id("elementosForm:sexo:0")).click();
	
	Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
	driver.quit();

}
@Test

public void deveInteragirCheckBox() {
	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	driver.findElement(By.id("elementosForm:comidaFavorita:3")).click();
	
	Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());
	driver.quit();
}
@Test

public void deveInteragirComCombo() {
	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
	Select combo = new Select(element);
	//combo.selectByIndex(4);
	//combo.selectByValue("superior");
	combo.selectByVisibleText("Superior");	
	Assert.assertEquals("Superior", combo.getFirstSelectedOption().getText());

	driver.quit();

}
@Test

public void deveVerificarValorCombo() {
	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
	Select combo = new Select(element);
	List<WebElement>options = combo.getOptions();
	Assert.assertEquals(8,options.size() );
	
	boolean encontrou = false;
	for(WebElement option: options) {
		if(option.getText().equals("Mestrado")) {
			encontrou = true;
			break;
			
		}
	}
	Assert.assertTrue(encontrou);
	driver.quit();
	
}

@Test

public void deveVerificarValorComboMultiplo() {
	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	WebElement element = driver.findElement(By.id("elementosForm:esportes"));
	Select combo = new Select(element);
	combo.selectByVisibleText("Natacao");	
	combo.selectByVisibleText("Corrida");
	combo.selectByVisibleText("O que eh esporte?");
	
	
	List<WebElement>allSelectedOptions = combo.getAllSelectedOptions();
	Assert.assertEquals(3, allSelectedOptions.size());
	
	driver.quit();
}

@Test

public void deveInteragirComBotao() {
	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	WebElement botao = driver.findElement(By.id("buttonSimple"));
	botao.click();
			
	Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
					
	
	driver.quit();
	
}

@Test

public void deveInteragirComLink() {
	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	driver.findElement(By.linkText("Voltar")).click();
	Assert.assertEquals("Voltou!", driver.findElement(By.id("resultado")).getText());
	driver.quit();
}

@Test

public void deveBuscarTextoNaPagina() {
	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	
	// Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Campo de Treinamento"));
	  Assert.assertEquals("Campo de Treinamento", driver.findElement(By.tagName("h3")).getText());
	  Assert.assertEquals("Cuidado onde clica, muitas armadilhas...", driver.findElement(By.className("facilAchar")).getText());
	    
	  
	driver.quit();
}
}














