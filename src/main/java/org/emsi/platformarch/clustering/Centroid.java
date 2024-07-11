package org.emsi.platformarch.clustering;

import java.util.Map;

public class Centroid {
    private final Map<String, Double> coordinates;


    public Centroid(Map<String, Double> coordinates) {
        this.coordinates = coordinates;
    }


    public Map<String, Double> getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Centroid{" +
                "coordinates=" + coordinates +
                '}';
    }
}
