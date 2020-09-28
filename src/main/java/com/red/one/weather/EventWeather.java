package com.red.one.weather;

import com.red.one.weather.dto.WeatherDto;

/**
 * Encapsulates all the data for a EventWeather that clients will request.
 */
public class EventWeather {

    /**
     * The title of the product.
     */
    private Object event;

    /**
     * The inventories of the product.
     */
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
