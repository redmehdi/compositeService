package com.red.one.weather.dto;

public class WeatherDto {
    private String status;
    private String probabilityOfRain;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProbabilityOfRain() {
        return probabilityOfRain;
    }

    public void setProbabilityOfRain(String probabilityOfRain) {
        this.probabilityOfRain = probabilityOfRain;
    }
}
