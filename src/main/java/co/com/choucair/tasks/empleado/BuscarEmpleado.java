package co.com.choucair.tasks.empleado;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.userinterface.empleado.EmpleadoUserinterface.*;

public class BuscarEmpleado implements Task {

    public static BuscarEmpleado creado() {
        return Tasks.instrumented(BuscarEmpleado.class);
    }

    @Override
    @Step("{0} Buscando empleado por id")
    public <T extends Actor> void performAs(T actor) {

        String idEmpleado = DiligenciarDatos.idEmpleado;

        actor.attemptsTo(
                Click.on(OPCION_MENU_PIM),
                WaitUntil.the(INPUT_ID, WebElementStateMatchers.isVisible()),
                Enter.theValue(idEmpleado).into(INPUT_BUSCAR_ID),
                Click.on(BTN_BUSCAR));
    }
}
