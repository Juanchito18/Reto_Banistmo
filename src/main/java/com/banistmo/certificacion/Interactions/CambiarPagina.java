package com.banistmo.certificacion.Interactions;

import java.util.Set;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class CambiarPagina implements Interaction{

	public CambiarPagina() {
		
				
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Set<String> setVentanas= Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
		setVentanas.remove(Serenity.getWebdriverManager().getCurrentDriver().getWindowHandle());
		Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(setVentanas.iterator().next());
		
	}
	
	public static CambiarPagina pasarAlaOtra() {
		return Tasks.instrumented(CambiarPagina.class); 
		}
	
}
