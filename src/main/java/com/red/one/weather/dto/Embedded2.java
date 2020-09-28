package com.red.one.weather.dto;

import lombok.Data;

import java.util.List;

@Data
public class Embedded2 {
    private List<Venue2> venues;
    private List<Attraction2> attractions;
}