package com.red.one.weather.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Public {
    private Date startDateTime;
    private boolean startTBD;
    private boolean startTBA;
    private Date endDateTime;
}
