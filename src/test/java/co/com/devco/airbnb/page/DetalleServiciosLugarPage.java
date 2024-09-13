package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleServiciosLugarPage {
    public static Target BOTON_TODOS_SERVICIOS = Target.the("boton ver todos los servicios").locatedBy("//div[@data-section-id='AMENITIES_DEFAULT']//button[contains(text(), 'servicios')]");
}
