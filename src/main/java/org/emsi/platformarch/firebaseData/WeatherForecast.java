package org.emsi.platformarch.firebaseData;

import java.util.List;

public class WeatherForecast {

    String cod;
    int message;
    int cnt;
    City city;
    List<Forecast> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Forecast> getList() {
        return list;
    }

    public void setList(List<Forecast> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "cod='" + cod + '\'' +
                ", message=" + message +
                ", cnt=" + cnt +
                ", city=" + city +
                ", list=" + list +
                '}';
    }
}
