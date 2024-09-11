package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.navigation.NavigateTo;
import co.com.devco.airbnb.search.LookForInformation;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

public class FiltrosEstadiaStepDefinitions {

    @Dado("que busque un airbnb para {string}, por {int} días y para {int} {string}")
    public void que_busque_un_airbnb_para_por_días_y_para(String string, Integer int1, Integer int2, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("filtre por {string}")
    public void filtre_por(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("los {int} primeros resultados deben tener {string} en {string} en los servicios del detalle")
    public void los_primeros_resultados_deben_tener_en_en_los_servicios_del_detalle(Integer int1, String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
