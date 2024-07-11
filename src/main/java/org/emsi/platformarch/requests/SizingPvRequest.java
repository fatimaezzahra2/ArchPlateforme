package org.emsi.platformarch.requests;

public class SizingPvRequest {
    private String id;
    private int mppt;
    private int vm;
    private double pu;
    private double eb;

    public SizingPvRequest(String id,int mppt, int vm, double pu,double eb) {
        this.id=id;
        this.mppt = mppt;
        this.vm = vm;
        this.pu = pu;
        this.eb=eb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getEb() {
        return eb;
    }

    public void setEb(double eb) {
        this.eb = eb;
    }
}
