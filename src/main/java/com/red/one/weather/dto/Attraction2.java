package com.red.one.weather.dto;

import lombok.Data;

import java.util.List;

@Data
public class Attraction2 {
    private String name;
    private String type;
    private String id;
    private boolean test;
    private String url;
    private String locale;
    private List<String> aliases;
    private List<Image3> images;
    private List<Classification2> classifications;
    private UpcomingEvents2 upcomingEvents;
    private Links3 _links;
}
