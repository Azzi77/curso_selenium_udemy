import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteRegraCadastro {
	private WebDriver driver;
	private DSL dsl;
	private CampoTreinamentoPage page;
	private String nome;
	private String sobrenome;
	private Object sexo;
	private List<String> comidas;
		
		@Before
		public void inicializa() {
		
		driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		dsl = new DSL(driver);
		
		
		page = new CampoTreinamentoPage(driver);
		}
		
		@After
		public void finaliza() {
			driver.quit();
			
		}
	
	public void deveValidarRegras(){
		page.setNome(nome);
		page.setSobrenome(sobrenome);
		
		if (sexo.equals("Masculino")) {
			page.setSexoMasculino();
		}else {
			page.setSexoFeminino();
		}
		page.setComidaPizza();
		page.setEscolaridade("Mestrado");
		page.setEsporte("Natacao");
		page.cadastrar();

}
}


