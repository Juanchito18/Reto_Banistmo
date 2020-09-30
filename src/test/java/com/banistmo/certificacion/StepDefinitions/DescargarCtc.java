package com.banistmo.certificacion.StepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DescargarCtc {

	@Before
	public void prepararEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	
	@Given("^que el usuario esta en la pagina Banistmo$")
	public void que_el_usuario_esta_en_la_pagina_Banistmo()  {
	   
		
	}


	@When("^edescarga el contrato en pdf$")
	public void edescarga_el_contrato_en_pdf()  {
	  
	}

	@Then("^el pvisualizara el mensaje Contrato de Tarjetas de Cr?dito\\.$")
	public void el_pvisualizara_el_mensaje_Contrato_de_Tarjetas_de_Cr_dito()  {
	    
	}

	
	
	
}
