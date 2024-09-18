package co.com.choucair.questions.iniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.userinterface.iniciosesion.InicioSesionUserinterface.NOMBRE_USUARIO_LOGUEADO;

public class ValidarInicioSesion implements Question<Boolean> {

    public static ValidarInicioSesion exitoso() {
        return new ValidarInicioSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return NOMBRE_USUARIO_LOGUEADO.resolveFor(actor).isVisible();
    }
}
