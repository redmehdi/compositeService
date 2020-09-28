package com.red.one.weather.dto;

import lombok.Data;

import java.util.List;

@Data
public class Venue2 {
    public String name;
    public String type;
    public String id;
    public boolean test;
    public String url;
    public String locale;
    public List<Image2> images;
    public String postalCode;
    public String timezone;
    public City city;
    public State state;
    public Country country;
    public Address address;
    public Location location;
    public List<Market> markets;
    public List<Dma> dmas;
    public BoxOfficeInfo boxOfficeInfo;
    public String parkingDetail;
    public String accessibleSeatingDetail;
    public GeneralInfo generalInfo;
    public UpcomingEvents upcomingEvents;
    public Links2 _links;
}
