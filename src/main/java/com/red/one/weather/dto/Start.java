package com.red.one.weather.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Start {
    private String localDate;
    private String localTime;
    private Date dateTime;
    private boolean dateTBD;
    private boolean dateTBA;
    private boolean timeTBA;
    private boolean noSpecificTime;
}
