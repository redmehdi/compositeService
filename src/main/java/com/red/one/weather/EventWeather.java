package com.red.one.weather;

import com.red.one.weather.dto.WeatherDto;

/**
 * Encapsulates all the data for a EventWeather that clients will request.
 */
public class EventWeather {

    private Object event;

    private WeatherDto weatherDto;

    public Object getEvent() {
        return event;
    }

    public void setEvent(Object event) {
        this.event = event;
    }

    public WeatherDto getWeatherDto() {
        return weatherDto;
    }

    public void setWeatherDto(WeatherDto weatherDto) {
        this.weatherDto = weatherDto;
    }

}
