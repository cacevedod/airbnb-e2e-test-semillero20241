package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.DetalleTodosServiciosPage;
import co.com.devco.airbnb.page.ResultadosEstadiaPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class BuscarApartadoServicio {
    public static Performable conNombre(String nombreApartadoServicio) {
        return Task.where("buscar apartado de servicios'" + nombreApartadoServicio + "'",
                Scroll.to(DetalleTodosServiciosPage.APARTADO_SERVICIOS.of(nombreApartadoServicio))
        );
    }
}
