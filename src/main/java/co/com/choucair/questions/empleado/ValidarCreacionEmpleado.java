package co.com.choucair.questions.empleado;

import co.com.choucair.tasks.empleado.DiligenciarDatos;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.userinterface.empleado.EmpleadoUserinterface.RESULTADO_BUSQUEDA_EMPLEADO;

public class ValidarCreacionEmpleado implements Question<Boolean> {

    public static ValidarCreacionEmpleado exitoso() {
        return new ValidarCreacionEmpleado();
    }

    String idEmpleado = DiligenciarDatos.idEmpleado;

    @Override
    @Step("{0} Validando creacion de usuario")
    public Boolean answeredBy(Actor actor) {
        return RESULTADO_BUSQUEDA_EMPLEADO.of(idEmpleado).resolveFor(actor).isVisible();
    }
}
