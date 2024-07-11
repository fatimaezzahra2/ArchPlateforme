package org.emsi.platformarch.clustering;

import java.util.Map;

public class Record {
    private final String description;
    private final Map<String, Double> features;

    public Record(String description, Map<String, Double> features) {
        this.description = description;
        this.features = features;
    }

    // constructor, getter, toString, equals and hashcode

    public String getDescription() {
        return description;
    }

    public Map<String, Double> getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        return "Record{" +
                "description='" + description + '\'' +
                ", features=" + features +
                '}';
    }
}
