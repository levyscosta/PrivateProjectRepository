package blank.page;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("file:///C:/Users/levy.costa/Desktop/testeApagar/index.html")
public class BlankHomePage extends UIInteractionSteps {

	public static By TXT_EMAIL_FIELD = By.id("email");
	public static By TXT_PHONE_FIELD = By.id("phone");
	public static By TXT_LAST_NAME_FIELD = By.id("family-name");
	public static By TXT_NAME_FIELD = By.id("given-name");
	public static By TXT_DT_NASCIMENTO_FIELD = By.id("dob");	
	public static By RDO_CREDIT_FIELD = By.name("cardtype");
	public static By P_INNER_TXT_FIELD = By.id("innertexto");
	public static By TR_INNER_TXT_FIELD = By.xpath("//*[@id=\"register\"]/fieldset[1]/table/tbody/tr/td");
	
	public static By TB_TEST_FIELD = By.id("tb1teste");

	

	@Step("Preenchendo o formulario")
	public void preencherForm() throws InterruptedException {
		
		 List<WebElement> rows = $(TB_TEST_FIELD).findElements(By.xpath(".//tr[td]"));
		 System.out.println(rows.size());
		 for (WebElement row : rows) {
	            List<WebElement> cells = row.findElements(By.tagName("td"));
	            System.out.println((cells.get(0).getText()));
	            System.out.println((cells.get(1).getText()));
	            System.out.println((cells.get(2).getText()));

	        }
		 
			
		$(TXT_LAST_NAME_FIELD).sendKeys("Costa");
		$(TXT_NAME_FIELD).sendKeys("Levy");
		findAll(RDO_CREDIT_FIELD).get(0).click();
		System.out.println(new Date());
		//setImplicitTimeout(50, ChronoUnit.SECONDS);		
		System.out.println(new Date());
		System.out.println("texto do parágrafo" + $(P_INNER_TXT_FIELD).getTextValue());
		System.out.println("texto do parágrafo" + $(TR_INNER_TXT_FIELD).getTextValue().equals("Não há dados para esta seleção!"));
		System.out.println("texto da TR" + $(TR_INNER_TXT_FIELD).getTextValue());
		
		System.out.println("está visivel " + $(TXT_DT_NASCIMENTO_FIELD).isVisible());
		System.out.println("está atualmente ativo " + $(TXT_DT_NASCIMENTO_FIELD).isCurrentlyEnabled());
		System.out.println("está atualmente displayado " + $(TXT_DT_NASCIMENTO_FIELD).isDisplayed());
		System.out.println("está atualmente presente " + $(TXT_DT_NASCIMENTO_FIELD).isPresent());
		System.out.println("está atualmente selecionado " + $(TXT_DT_NASCIMENTO_FIELD).isSelected());
		
		System.out.println(new Date());
		$(TXT_DT_NASCIMENTO_FIELD).waitUntilVisible();
		System.out.println(new Date());
//		
//		BlankHomePage2 blk = this.switchToPage(BlankHomePage2.class);
//		//blk.open();
//		Thread.sleep(8000);
//		System.out.println("Fechar");
		

	}

}
