package org.emsi.platformarch.firebaseData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {
    @JsonProperty("3h")
    double troisHeures_Snow;

    public double getTroisHeures_Snow() {
        return troisHeures_Snow;
    }

    public void setTroisHeures_Snow(double troisHeures_Snow) {
        this.troisHeures_Snow = troisHeures_Snow;
    }
}
