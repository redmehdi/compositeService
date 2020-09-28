package com.red.one.weather;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.red.one.weather.dto.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * An adapter to communicate with information micro-service.
 */
@Component
public class EventClientImpl implements EventClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventClientImpl.class);

    @Value("${metadata.events.url}")
    private String uri;

    public Root get(final String location, final String endDate) {
        Map<String, String> params = new HashMap<>();
        params.put("city", location);
        params.put("endDateTime", endDate);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, Root.class, params);
    }
}
