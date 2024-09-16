package co.com.devco.airbnb.interaction;

import co.com.devco.airbnb.page.DetalleServiciosLugarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Displayed;


public class CerrarTraducciones implements Performable {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //if(actor.asksFor(Displayed.of("//h1[text()='Traducción activada']"))) {
            actor.attemptsTo(Click.on(DetalleServiciosLugarPage.CERRAR_TRADUCCION).afterWaitingUntilPresent());
        //}
    }
    public static CerrarTraducciones condicional() {
        return new CerrarTraducciones();
    }
}
