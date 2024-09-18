package co.com.choucair.tasks.empleado;

import co.com.choucair.util.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.models.DatosPrueba.obtener;
import static co.com.choucair.userinterface.empleado.EmpleadoUserinterface.*;

public class DiligenciarDatos implements Task {

    public static DiligenciarDatos empleado() {
        return Tasks.instrumented(DiligenciarDatos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_MENU_PIM),
                Click.on(BTN_AGREGAR),
                Enter.theValue(obtener("primerNombre")).into(INPUT_PRIMER_NOMBRE),
                Enter.theValue(obtener("segundoNombre")).into(INPUT_SEGUNDO_NOMBRE),
                Enter.theValue(obtener("apellido")).into(INPUT_APELLIDO),
                Enter.theValue(obtener("id")).into(INPUT_ID),
                Click.on(SWITCH_CREAR_DATOS_SESION),
                Enter.theValue(obtener("usuario2")).into(INPUT_USUARIO),
                Click.on(INPUT_CLAVE),
                Enter.theValue(obtener("clave2")).into(INPUT_CLAVE),
                Click.on(INPUT_CLAVE),
                Enter.theValue(obtener("confirmaClave2")).into(INPUT_CONFIRMAR_CLAVE),
                Click.on(BTN_GUARDAR)
        );
    }
}