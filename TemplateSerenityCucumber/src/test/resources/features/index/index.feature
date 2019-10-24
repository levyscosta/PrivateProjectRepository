Feature: relatorios portal myway

#	Background:
#    Given Eu tenha aberto a pagina de credenciais no portal myway 
#    And tiver efetuado o login microsoft com o email "levy.costa@accenture.com"
#    And tiver efetuado o login no adfs da accenture com o login "levy.costa" e password "Sp@_2008"
     
	@executar
	Scenario Outline: Preencher campos da pagina de index
	  Given Eu acesse a pagina de index
		When Preencher os campos <firstname> <lastname> <email> <url> <telefone> 
		And E solicitar o cadastro  
		Then Entao a pagina o usuario devera visualizar a pagina xpto
		
	Examples:
		| firstname | lastname | email | url | telefone |
		| "levy" | "costa" | "levycosta@gmail.com" | "www.google.com.br" |"81994513141"|	
		| "novo" | "costa" | "novo@gmail.com" | "www.novo.com.br" |"8199999999"|
		| "3" | "valor1" | "valor1@gmail.com" | "www.valor1.com.br" |"8199999999"|
		| "4" | "valor2" | "valor2@gmail.com" | "www.valor2.com.br" |"8199999999"|
		| "5" | "valor3" | "valor3@gmail.com" | "www.valor3.com.br" |"8199999999"|
	
		
		