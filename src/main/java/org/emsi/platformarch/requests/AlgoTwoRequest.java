package org.emsi.platformarch.requests;

public class AlgoTwoRequest {
    //it should contains all the data given by the user
    private String id;
    private int nj;//il faut le mettre en miniscule : nombre jour d'autonomie
    private float d;//profondeur de decharge pour batterie
    private int u;//tension de batterie
    private int mppt;//le mode de suivie de puissance soit avec mppt ou non (pour pv)
    private int vm;//mode de ventilation
    private double pu;//puissance crete elementaire (pour pv)
    private double rayon;//rayon elementaire pour wind turbine
    private double coef;//si on a dans le systeme wind turbine et pv sont tous les deux cochés donc on aura dans coef=0.5
    private double pondmax;
    private double umaxond;
    private  double imax;
    private double icc;
    private double uco;
    private double umppmin;
    private double umppmax;
    private double umpp;

    public AlgoTwoRequest(String id, int nj, float d, int u, int mppt, int vm, double pu, double rayon, double coef, double pondmax, double umaxond, double imax,double icc,double uco,double umppmin , double umppmax , double umpp) {
        this.id = id;
        this.nj = nj;
        this.d = d;
        this.u = u;
        this.mppt = mppt;
        this.vm = vm;
        this.pu = pu;
        this.rayon = rayon;
        this.coef = coef;
        this.pondmax=pondmax;
        this.umaxond=umaxond;
        this.imax=imax;
        this.icc=icc;
        this.uco=uco;
        this.umppmin=umppmin;
        this.umppmax=umppmax;
        this.umpp=umpp;
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
