package com.red.one.weather.dto;

import lombok.Data;

@Data
public class Dates {
    private Start start;
    private String timezone;
    private Status status;
    private boolean spanMultipleDays;
}
