package org.emsi.platformarch.requests;

public class UploadRequest {
    private double latitude;
    private double longitude;
    private String projectId;

    public UploadRequest(double latitude, double longitude, String projectId) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.projectId = projectId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
