package co.com.choucair.tasks.iniciosesion;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.models.DatosPrueba.obtener;
import static co.com.choucair.userinterface.iniciosesion.InicioSesionUserinterface.*;

public class InicioSesion implements Task {

    public static InicioSesion usuario() {
        return Tasks.instrumented(InicioSesion.class);
    }

    @Override
    @Step("{0} Diligenciando formulario de login")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN_MENU),
                Enter.theValue(obtener("usuario")).into(INPUT_USUARIO),
                Enter.theValue(obtener("clave")).into(INPUT_CLAVE),
                Click.on(BTN_LOGIN),
                WaitUntil.the(NOMBRE_USUARIO_LOGUEADO, WebElementStateMatchers.isVisible()));
    }
}
