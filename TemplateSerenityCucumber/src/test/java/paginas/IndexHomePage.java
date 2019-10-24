package paginas;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("file:/C:/Users/levy.costa/Desktop/testeApagar/index_1.html")
public class IndexHomePage extends UIInteractionSteps {

	public static By TXT_EMAIL_FIELD = By.id("email");
	public static By TXT_PHONE_FIELD = By.id("phone");
	public static By TXT_LAST_NAME_FIELD = By.id("family-name");
	public static By TXT_NAME_FIELD = By.id("given-name");
	public static By TXT_DT_NASCIMENTO_FIELD = By.id("dob");	
	public static By RDO_CREDIT_FIELD = By.name("cardtype");
	public static By P_INNER_TXT_FIELD = By.id("innertexto");
	public static By BTN_CADASTRAR_FIELD = By.id("cadastrar");
	public static By TR_INNER_TXT_FIELD = By.xpath("*[@id=\"register\"]/fieldset[1]/table/tbody/tr/td");	
	

	@Step("Preenchendo o formulario")
	public void preencher_form(String nome, String sobrenome, String email, String url, String telefone)  throws InterruptedException {
		
		$(TXT_LAST_NAME_FIELD).sendKeys(sobrenome);
		$(TXT_PHONE_FIELD).sendKeys(telefone);
		$(TXT_EMAIL_FIELD).sendKeys(email);
		$(TXT_NAME_FIELD).sendKeys(nome);
		findAll(RDO_CREDIT_FIELD).get(0).click();
		Thread.sleep(3000);
	}
	
	public void cadastrar() throws InterruptedException {
		$(BTN_CADASTRAR_FIELD).click();
		Thread.sleep(3000);
	}

}
