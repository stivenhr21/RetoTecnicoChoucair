package co.com.choucair.stepdefinitions.empleado;

import co.com.choucair.questions.empleado.ValidarCreacionEmpleado;
import co.com.choucair.tasks.empleado.BuscarEmpleado;
import co.com.choucair.tasks.empleado.DiligenciarDatos;
import co.com.choucair.util.CargarDatos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EmpleadoStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("el usuario diligencia el formulario de informacion del empleado")
    public void elUsuarioDiligenciaElFormularioDeInformacionDelEmpleado(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                CargarDatos.conLaSiguiente(informacion),
                DiligenciarDatos.empleado());
    }

    @Cuando("el usuario realiza la busqueda del empleado agregado")
    public void elUsuarioRealizaLaBusquedaDelEmpleadoAgregado() {
        theActorInTheSpotlight().attemptsTo(
                BuscarEmpleado.creado());
    }

    @Entonces("el usuario visualizara el nuevo empleado")
    public void elUsuarioVisualizaraElNuevoEmpleado() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarCreacionEmpleado.exitoso(), Matchers.equalTo(true)));
    }
}
