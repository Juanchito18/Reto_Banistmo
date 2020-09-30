package com.banistmo.certificacion.Tasks;

import com.banistmo.certificacion.UserInterfaces.IrAdescargar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class LlegarHasta implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(IrAdescargar.PRODUCTOSYSERVICIOS),
				Click.on(IrAdescargar.TARJETACREDITO),
				Click.on(IrAdescargar.DESCARGAR)
				);
		
	}
	
	public static LlegarHasta descargarElContrato() {
	
	return Tasks.instrumented(LlegarHasta.class);
	
	}

}
