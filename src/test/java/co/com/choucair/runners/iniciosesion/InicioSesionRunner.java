package co.com.choucair.runners.iniciosesion;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/iniciosesion/inicio_sesion.feature",
        tags = "@InicioSesionExitoso",
        glue = "co.com.choucair.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class InicioSesionRunner {
}
