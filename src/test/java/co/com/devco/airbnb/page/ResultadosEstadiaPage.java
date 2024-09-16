package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosEstadiaPage {
    public static Target LISTA_RESULTADOS = Target.the("lista de resultados de la busqueda de estadia").locatedBy("//div[@itemprop='itemListElement']");
    public static Target PRIMER_ELEMENTO_LISTA_RESULTADOS = Target.the("primer elemento de resultados de la busqueda de estadia").locatedByFirstMatching("//div[@itemprop='itemListElement']//a[@aria-labelledby]");
    public static Target FILTRO_BOT = Target.the("boton para el filtro").locatedBy("//div[contains(@data-testid, 'category-item--{0}--unchecked')]");
}
