package co.com.choucair.stepdefinitions.empleado;

import co.com.choucair.tasks.empleado.DiligenciarDatos;
import co.com.choucair.tasks.iniciosesion.InicioSesion;
import co.com.choucair.util.CargarDatos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EmpleadoStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("inicio sesion con mis credenciales")
    public void inicioSesionConMisCredenciales(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                CargarDatos.conLaSiguiente(informacion),
                InicioSesion.usuario()
        );
    }

    @Cuando("diligencio el formulario de informacion del empleado")
    public void diligencioElFormularioDeInformacionDelEmpleado(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                CargarDatos.conLaSiguiente(informacion),
                DiligenciarDatos.empleado()
        );
    }

    @Cuando("realizo la busqueda del empleado agregado")
    public void realizoLaBusquedaDelEmpleadoAgregado() {
    }

    @Entonces("se visualizara el empleado agregado en una tabla")
    public void seVisualizaraElEmpleadoAgregadoEnUnaTabla() {
    }

}
