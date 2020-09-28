package com.red.one.weather.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.red.one.weather.EventClient;
import com.red.one.weather.EventWeather;
import com.red.one.weather.WeatherClient;
import com.red.one.weather.dto.Embedded;
import com.red.one.weather.dto.Event;
import com.red.one.weather.dto.Root;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * The aggregator aggregates calls on various micro-services, collects data and further publishes
 * them under a REST endpoint.
 */
@RestController
public class EventWeatherController {

    @Resource
    private EventClient eventClient;

    @Resource
    private WeatherClient weatherClient;


    /**
     * Retrieves product data.
     *
     * @return a Product.
     */
    @RequestMapping(value = "/events/{city}/weather/{endDateTime}", method = RequestMethod.GET)
    public EventWeather getProduct(@PathVariable final String city, @PathVariable final String endDateTime) {

        EventWeather eventWeather = new EventWeather();

        Root events = eventClient.get(city, endDateTime);
        //Fallback to error message
        Embedded embedded = events.get_embedded();
        List<Event> eventList = embedded.getEvents();
        for (Object event : eventList) {
            eventWeather.setEvent(Objects.requireNonNullElse(event, "Error: Fetching Product Title Failed"));
            //Fallback to default error inventory
            final String eventToString = event.toString();
            weatherClient.getWeatherByCityAndDate(city, eventToString);
            //product.setProductInventories(requireNonNullElse(productInventory, -1));
        }



        return eventWeather;
    }

}
