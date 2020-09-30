package com.banistmo.certificacion.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resourses/features/contratocredito.feature"
,glue="com.banistmo.certification.Reto_Banistmo.stepdefinitions"
,snippets=SnippetType.CAMELCASE //, tags="@tag2"
)



public class DescargarContrato {

}
