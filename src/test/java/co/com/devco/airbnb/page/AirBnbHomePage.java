package co.com.devco.airbnb.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com.co")
public class AirBnbHomePage extends PageObject {
    public static Target LUGAR_ESTADIA_INPUT = Target.the("lugar estadia input").locatedBy("//input[@id='bigsearch-query-location-input']");
    public static Target DIA_PPAL_FECHAS_BOT = Target.the("boton principal fechas").locatedBy("//div[@data-testid='structured-search-input-field-split-dates-0']");
    public static Target DIA_LLEGADA_BOT = Target.the("boton dia llegada").locatedBy("//div[@data-testid='16/09/2024']");
    public static Target DIA_SALIDA_BOT = Target.the("boton dia salida").locatedBy("//div[@data-testid='20/09/2024']");
    public static Target INDIVIDUOS_PPAL_BOT = Target.the("boton principal individuos").locatedBy("//div[@data-testid='structured-search-input-field-guests-button']");
    public static Target MAS_ADULTOS_BOT = Target.the("boton agregar adultos").locatedBy("//button[@data-testid='stepper-adults-increase-button']");
    public static Target BOTON_BUSCAR_ESTADIA = Target.the("boton buscar estadia").locatedBy("//button[@data-testid='structured-search-input-search-button']");
}
