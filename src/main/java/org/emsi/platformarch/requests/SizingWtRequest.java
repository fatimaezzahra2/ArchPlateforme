package org.emsi.platformarch.requests;

public class SizingWtRequest {
    private String id;
    private double rayon;
    private double coef;
    private double precup;

    public SizingWtRequest(String id, double rayon, double coef, double precup ) {
        this.id = id;
        this.rayon = rayon;
        this.coef = coef;
        this.precup=precup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public double getPrecup() {
        return precup;
    }

    public void setPrecup(double precup) {
        this.precup = precup;
    }
}

