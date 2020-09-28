package com.red.one.weather.dto;

import lombok.Data;

import java.util.List;

@Data
public class Links {
    public Self self;
    public List<Attraction> attractions;
    public List<Venue> venues;
}
