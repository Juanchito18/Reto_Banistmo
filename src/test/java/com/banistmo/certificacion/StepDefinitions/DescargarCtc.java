package com.banistmo.certificacion.StepDefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.banistmo.certificacion.Tasks.LlegarHasta;
import com.banistmo.certificacion.Utils.MyDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DescargarCtc {

	@Before
	public void prepararEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@Given("^que el usuario esta en la pagina Banistmo\\.$")
	public void queElUsuarioEstaEnLaPaginaBanistmo() {

		theActorCalled("JuanD").can(BrowseTheWeb.with(MyDriver.web().abrirLaPagina("https://www.banistmo.com/wps/portal/banistmo/personas/")));
	}

	@When("^descarga el contrato en pdf$")
	public void descargaElContratoEnPdf() throws Exception {
		theActorInTheSpotlight().attemptsTo(LlegarHasta.descargarElContrato());
		
	}

	@Then("^el podra visualizar el mensaje (.*)$")
	public void elPodraVisualizarElMensajeContratoDeTarjetasDeCredito(String message) {
	    
		
	}
	
}
