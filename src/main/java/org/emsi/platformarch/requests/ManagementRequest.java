package org.emsi.platformarch.requests;

public class ManagementRequest {
    private String id;
    private int nj;//il faut le mettre en miniscule
    private float d;
    private int u;
    private double rayon;
    private double c;
    private double nss;
    private double np;

    public ManagementRequest(String id, int nj, float d, int u, double rayon,double c, double nss, double np ) {
        this.id = id;
        this.nj = nj;
        this.d = d;
        this.u = u;
        this.rayon = rayon;
        this.c=c;
        this.nss=nss;
        this.np=np;
    }

    public double getNss() {
        return nss;
    }

    public void setNss(double nss) {
        this.nss = nss;
    }

    public double getNp() {
        return np;
    }

    public void setNp(double np) {
        this.np = np;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
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

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
