package co.com.choucair.questions.iniciosesion;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.userinterface.iniciosesion.InicioSesionUserinterface.USUARIO_LOGUEADO;


public class ValidarInicioSesion implements Question<Boolean> {

    public static ValidarInicioSesion exitoso() {
        return new ValidarInicioSesion();
    }

    @Override
    @Step("{0} Validando inicio de sesion")
    public Boolean answeredBy(Actor actor) {
        return USUARIO_LOGUEADO.resolveFor(actor).isVisible();
    }
}
