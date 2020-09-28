package com.red.one.weather.dto;

import lombok.Data;

@Data
public class Classification {
    private boolean primary;
    private Segment segment;
    private Genre genre;
    private SubGenre subGenre;
    private Type type;
    private SubType subType;
    private boolean family;
}
