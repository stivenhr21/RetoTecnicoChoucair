package co.com.choucair.util;

import co.com.choucair.models.DatosPrueba;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CargarDatos implements Task {
    private static final Logger LOGGER = LogManager.getLogger(CargarDatos.class.getName());
    private final List<Map<String, Object>> datosDePrueba;

    public CargarDatos(List<Map<String, Object>> datosDePrueba) {
        this.datosDePrueba = datosDePrueba;
    }

    public static CargarDatos conLaSiguiente(List<Map<String, Object>> informacion) {
        return instrumented(CargarDatos.class, informacion);
    }

    @Override
    @Step("{0} carga datos de prueba para automatizacion")
    public <T extends Actor> void performAs(T actor) {
        if (datosDePrueba.isEmpty()) {
            manejarDatosVacios(actor);
            return;
        }
        Map<String, Object> mapaAuxiliar = recolectarDatosValidos();
        actualizarDatosPrueba(mapaAuxiliar);
    }

    private <T extends Actor> void manejarDatosVacios(T actor) {
        actor.remember("", new HashMap<>());
        LOGGER.info("La lista de datos de prueba está vacía");
    }

    private Map<String, Object> recolectarDatosValidos() {
        Map<String, Object> mapaAuxiliar = new HashMap<>();
        for (Map<String, Object> mapa : datosDePrueba) {
            if (mapa == null) {
                LOGGER.info("Se encontró un mapa nulo en los datos de prueba.");
                continue;
            }
            agregarEntradasValidas(mapa, mapaAuxiliar);
        }
        return mapaAuxiliar;
    }

    private void agregarEntradasValidas(Map<String, Object> mapa, Map<String, Object> mapaAuxiliar) {
        for (Map.Entry<String, Object> entrada : mapa.entrySet()) {
            if (entrada.getKey() == null || entrada.getValue() == null) {
                LOGGER.info("Se encontró una entrada nula en los datos de prueba.");
                continue;
            }
            mapaAuxiliar.put(entrada.getKey(), entrada.getValue());
        }
    }

    private void actualizarDatosPrueba(Map<String, Object> mapaAuxiliar) {
        if (mapaAuxiliar.isEmpty()) {
            LOGGER.info("Todos los datos de prueba están vacíos.");
            return;
        }

        if (DatosPrueba.getMap() == null) {
            DatosPrueba.setMap(mapaAuxiliar);
        } else {
            DatosPrueba.getMap().putAll(mapaAuxiliar);
        }
    }
}
