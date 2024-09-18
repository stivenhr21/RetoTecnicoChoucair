package co.com.choucair.tasks.comunes;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUrl implements Task {

    public static AbrirUrl dePagina() {
        return Tasks.instrumented(AbrirUrl.class);
    }

    @Override
    @Step("{0} Abriendo URL del sitio web")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.productStore"));
    }
}
