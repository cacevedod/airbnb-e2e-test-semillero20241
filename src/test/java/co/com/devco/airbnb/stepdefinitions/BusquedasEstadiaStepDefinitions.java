package co.com.devco.airbnb.stepdefinitions;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Cuando;

public class BusquedasEstadiaStepDefinitions {

    @Cuando("busque un airbnb para {string}, por {int} días y para {int} {string}")
    public void busque_un_airbnb_para_por_días_y_para(String string, Integer int1, Integer int2, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debo encontrar al menos {int} locación")
    public void debo_encontrar_al_menos_locación(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
