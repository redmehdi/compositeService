/*
 * The MIT License
 * Copyright © 2014-2019 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

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
