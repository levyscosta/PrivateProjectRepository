package blank;

import blank.page.BlankHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepDefinitions {
	
	@Steps
	BlankHomePage blankHP;
	
	@Given("Step Dado")
	public void i_am_on_the_DuckDuckGo_home_page() {
		System.out.println("passou no DADO");
		blankHP.open();
	}

	@When("Step Quando")
	public void i_search_for() throws InterruptedException {
		System.out.println("passou no QUANDO");
		blankHP.preencherForm();
	}
	
	@And("Step E")
	public void efetuar_login_ADFS_Accenture() {
		System.out.println("And");
	}


}
