package com.red.one.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Sales {
    @JsonProperty("public")
    private Public _public;
    private List<Presale> presales;
}
