package org.emsi.platformarch.firebaseData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
    @JsonProperty("3h")
    double troisHeures;

    public double getTroisHeures() {
        return troisHeures;
    }

    public void setTroisHeures(double troisHeures) {
        this.troisHeures = troisHeures;
    }
}
