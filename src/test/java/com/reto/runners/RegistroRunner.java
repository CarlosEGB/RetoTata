package com.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/registrarse.feature",
        glue = "com.reto.steps_definitions",
        snippets = SnippetType.CAMELCASE
)
public class RegistroRunner {
}
