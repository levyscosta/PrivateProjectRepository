package paginas.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import paginas.IndexHomePage;

public class StepsIndex {
	
	@Steps
	IndexHomePage indexHome;
	
	@Given("Eu acesse a pagina de index")
	public void acessar_pagina() {
		indexHome.open();
		System.out.println("passou no DADO");
	}

	@When("Preencher os campos {string} {string} {string} {string} {string}")
	public void preencher_form(String nome, String sobrenome, String email, String url, String telefone) throws InterruptedException {
		indexHome.preencher_form(nome, sobrenome, email, url, telefone);
		System.out.println("passou no QUANDO");
	}
	
	@And("E solicitar o cadastro")
	public void cadastrar() throws InterruptedException {
		indexHome.cadastrar();
		System.out.println("And");
	}
	
	@Then("Entao a pagina o usuario devera visualizar a pagina xpto")
	public void direcionar_novapagina() {
		System.out.println("And");
	}


}
