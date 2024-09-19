package co.com.choucair.util;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Interaction {

    private final int tiempo;

    public Esperar(int tiempo) {
        this.tiempo = tiempo;
    }

    public static Performable unTiempo(int tiempo) {
        return instrumented(Esperar.class, tiempo);
    }

    @Override
    @Step("{0} Esperando un tiempo")
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(tiempo);
    }
}
