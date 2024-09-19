package co.com.choucair.stepdefinitions.iniciosesion;

import co.com.choucair.questions.iniciosesion.ValidarInicioSesion;
import co.com.choucair.tasks.comunes.AbrirUrl;
import co.com.choucair.tasks.iniciosesion.InicioSesion;
import co.com.choucair.util.CargarDatos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class InicioSesionStepdefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentra en la pagina de inicio de sesion")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled("El usuario").wasAbleTo(
                AbrirUrl.dePagina());
    }

    @Cuando("el usuario ingresa sus credenciales")
    public void elUsuarioIngresaSusCredenciales(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                CargarDatos.conLaSiguiente(informacion),
                InicioSesion.usuario());
    }

    @Entonces("el usuario se visualizara logueado en la pagina de inicio")
    public void elUsuarioSeVisualizaraLogueadoEnLaPaginaDeInicio() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarInicioSesion.exitoso(), Matchers.equalTo(true)));
    }
}
