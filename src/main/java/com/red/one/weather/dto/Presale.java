package com.red.one.weather.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Presale {
    public Date startDateTime;
    public Date endDateTime;
    public String name;
}
