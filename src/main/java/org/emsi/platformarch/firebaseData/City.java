package org.emsi.platformarch.firebaseData;

public class City {
    int id;
    String name;
    Coord coord;
    String country;
    int population;
    int timezone;
    long sunrise;
    long sunset;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coord=" + coord.toString() +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", timezone=" + timezone +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }
/*
    public Map<String, Object> toMap() {
        Map<String, Object> cityMap = new HashMap<>();
        cityMap.put("id", this.id);
        cityMap.put("name", this.name);
        cityMap.put("coord", this.coord);
        cityMap.put("country", this.country);
        cityMap.put("population", this.population);
        cityMap.put("timezone", this.timezone);
        cityMap.put("sunrise", this.sunrise);
        cityMap.put("sunset", this.sunset);
        return cityMap;
    }*/

}
