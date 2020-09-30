package com.banistmo.certificacion.UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IrAdescargar extends PageObject {

	public static final Target PRODUCTOSYSERVICIOS =Target.the("Lnk producs&Services").locatedBy("//a[contains(text(), 'Productos & Servicios')]");
	public static final Target TARJETACREDITO =Target.the("Lnk Tc").locatedBy("//a[contains(text(), 'Tarjetas de Crédito')]");
	public static final Target DESCARGAR = Target.the("Descarga").locatedBy("//a[contains(text(), 'Descargar Contrato de Tarjeta de Crédito')]");
	
	
	
	
}
