package com.red.one.weather;

import com.red.one.weather.dto.WeatherDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * An adapter to communicate with weather forcast station micro-service.
 */
@Component
public class WeatherClientImpl implements WeatherClient {

  private static final Logger LOGGER = LoggerFactory.getLogger(WeatherClientImpl.class);

  @Override
  public WeatherDto getWeatherByCityAndDate(final String city, final String date) {
    return null;
  }
}
