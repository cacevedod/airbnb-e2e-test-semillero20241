package co.com.devco.airbnb.task;

import co.com.devco.airbnb.interaction.CerrarTraducciones;
import co.com.devco.airbnb.page.DetalleServiciosLugarPage;
import co.com.devco.airbnb.page.ResultadosEstadiaPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;


public class AbrirTodosServiciosDetalle {
    public static Performable para(Integer cantidadValidar) {
        return Task.where("ver el detalle del elemento'",
                Scroll.to(ResultadosEstadiaPage.PRIMER_ELEMENTO_LISTA_RESULTADOS),
                JavaScriptClick.on(ResultadosEstadiaPage.PRIMER_ELEMENTO_LISTA_RESULTADOS),
                Switch.toTheOtherWindow(),
                CerrarTraducciones.condicional(),
                Scroll.to(DetalleServiciosLugarPage.TITULO_SECCION_BOTON).andAlignToTop(),
                Click.on(DetalleServiciosLugarPage.BOTON_TODOS_SERVICIOS).afterWaitingUntilPresent()

        );
    }
}
