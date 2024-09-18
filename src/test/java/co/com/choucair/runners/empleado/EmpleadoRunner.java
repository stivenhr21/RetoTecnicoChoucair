package co.com.choucair.runners.empleado;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/empleado/empleado.feature",
        tags = "@RegistroExitoso",
        glue = "co.com.choucair.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class EmpleadoRunner {
}
