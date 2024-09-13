package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirBnbHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SeleccionarEstadia {
    public static Performable con(String lugarEstadia, Integer diasEstadia, Integer cantidadIndividuo, String tipoIndividuo) {
        return Task.where("selecionar estadia para '" + lugarEstadia + "', por '"+ diasEstadia + "' para, '" + cantidadIndividuo + "' '" + tipoIndividuo + "'",
                Enter.theValue(lugarEstadia).into(AirBnbHomePage.LUGAR_ESTADIA_INPUT),
                Click.on(AirBnbHomePage.DIA_PPAL_FECHAS_BOT),
                Click.on(AirBnbHomePage.DIA_LLEGADA_BOT),
                Click.on(AirBnbHomePage.DIA_SALIDA_BOT),
                Click.on(AirBnbHomePage.INDIVIDUOS_PPAL_BOT),
                Click.on(AirBnbHomePage.MAS_ADULTOS_BOT),
                Click.on(AirBnbHomePage.MAS_ADULTOS_BOT),
                Click.on(AirBnbHomePage.BOTON_BUSCAR_ESTADIA)
        );
    }
}
