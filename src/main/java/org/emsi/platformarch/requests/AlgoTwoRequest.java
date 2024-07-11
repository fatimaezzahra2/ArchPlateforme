package org.emsi.platformarch.requests;

public class AlgoTwoRequest {
    //it should contains all the data given by the user
    private String id;
    private int nj;//il faut le mettre en miniscule
    private float d;
    private int u;
    private int mppt;
    private int vm;
    private double pu;
    private double rayon;
    private double coef;

    public AlgoTwoRequest(String id, int nj, float d, int u, int mppt, int vm, double pu, double rayon, double coef) {
        this.id = id;
        this.nj = nj;
        this.d = d;
        this.u = u;
        this.mppt = mppt;
        this.vm = vm;
        this.pu = pu;
        this.rayon = rayon;
        this.coef = coef;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNj() {
        return nj;
    }

    public void setNj(int nj) {
        this.nj = nj;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public int getU() {
        return u;
    }

    public void setU(int u) {
        this.u = u;
    }

    public int getMppt() {
        return mppt;
    }

    public void setMppt(int mppt) {
        this.mppt = mppt;
    }

    public int getVm() {
        return vm;
    }

    public void setVm(int vm) {
        this.vm = vm;
    }

    public double getPu() {
        return pu;
    }

    public void setPu(double pu) {
        this.pu = pu;
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
}
