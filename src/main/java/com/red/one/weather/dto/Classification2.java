package com.red.one.weather.dto;

import lombok.Data;

@Data
public class Classification2 {
    private boolean primary;
    private Segment2 segment;
    private Genre2 genre;
    private SubGenre2 subGenre;
    private Type2 type;
    private SubType2 subType;
    private boolean family;
}
