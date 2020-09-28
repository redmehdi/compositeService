package com.red.one.weather.dto;

import lombok.Data;

@Data
public class PriceRanx {
    public String type;
    public String currency;
    public double min;
    public double max;
}
