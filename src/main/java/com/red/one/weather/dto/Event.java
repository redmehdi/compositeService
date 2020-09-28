package com.red.one.weather.dto;

import lombok.Data;

import java.util.List;

@Data
public class Event {
    private String name;
    private String type;
    private String id;
    private boolean test;
    private String url;
    private String locale;
    private List<Image> images;
    private Sales sales;
    private Dates dates;
    private List<Classification> classifications;
    private Promoter promoter;
    private List<Promoter2> promoters;
    private List<PriceRanx> priceRanges;
    private Seatmap seatmap;
    private Accessibility accessibility;
    private TicketLimit ticketLimit;
    private AgeRestrictions ageRestrictions;
    private Links _links;
    private Embedded2 _embedded;
}