package org.emsi.platformarch.requests;

public class SizingOndulorRequest {
    private String id;
    private double pondmax;
    private double umaxond;
    private double imax;
    private double icc;
    private double uco;
    private double umppmin;
    private double umppmax;
    private double umpp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPondmax() {
        return pondmax;
    }

    public void setPondmax(double pondmax) {
        this.pondmax = pondmax;
    }

    public double getUmaxond() {
        return umaxond;
    }

    public void setUmaxond(double umaxond) {
        this.umaxond = umaxond;
    }

    public double getImax() {
        return imax;
    }

    public void setImax(double imax) {
        this.imax = imax;
    }

    public double getIcc() {
        return icc;
    }

    public void setIcc(double icc) {
        this.icc = icc;
    }

    public double getUco() {
        return uco;
    }

    public void setUco(double uco) {
        this.uco = uco;
    }

    public double getUmppmin() {
        return umppmin;
    }

    public void setUmppmin(double umppmin) {
        this.umppmin = umppmin;
    }

    public double getUmppmax() {
        return umppmax;
    }

    public void setUmppmax(double umppmax) {
        this.umppmax = umppmax;
    }

    public double getUmpp() {
        return umpp;
    }

    public void setUmpp(double umpp) {
        this.umpp = umpp;
    }
}
