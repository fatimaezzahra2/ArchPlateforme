package org.emsi.platformarch.requests;

public class SizingBatteryRequest {
    private String id;
    private int nj;//il faut le mettre en miniscule
    private float d;
    private int u;

    public SizingBatteryRequest(String id, int nj, float d, int u) {
        this.id = id;
        this.nj = nj;
        this.d = d;
        this.u = u;
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

    // Getters and setters

}
