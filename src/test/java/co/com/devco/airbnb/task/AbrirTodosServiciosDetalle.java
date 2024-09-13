package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.DetalleServiciosLugarPage;
import co.com.devco.airbnb.page.ResultadosEstadiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;


public class AbrirTodosServiciosDetalle {
    public static Performable para(Integer cantidadValidar) {
        Actor actor = OnStage.theActorInTheSpotlight();
        return Task.where("ver el detalle del elemento'",
                Click.on(ResultadosEstadiaPage.PRIMER_ELEMNTO_LISTA_RESULTADOS),
                Scroll.to(DetalleServiciosLugarPage.BOTON_TODOS_SERVICIOS).andAlignToTop(),
                Click.on(DetalleServiciosLugarPage.BOTON_TODOS_SERVICIOS)

        );
    }
}
