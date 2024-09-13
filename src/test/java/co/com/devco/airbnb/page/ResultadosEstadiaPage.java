package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosEstadiaPage {
    public static Target LISTA_RESULTADOS = Target.the("lista de resultados de la busqueda de estadia").locatedBy("//div[contains(@class,'c4mnd7m')]");
    public static Target PRIMER_ELEMNTO_LISTA_RESULTADOS = Target.the("primer elemento de resultados de la busqueda de estadia").locatedByFirstMatching("//div[@itemprop='itemListElement'][.//meta[@content='1']]//a");
    public static Target FILTRO_BOT = Target.the("boton para el filtro").locatedBy("//div[contains(@data-testid, 'category-item--{0}--unchecked')]");
}
