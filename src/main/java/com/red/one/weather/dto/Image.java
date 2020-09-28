package com.red.one.weather.dto;

import lombok.Data;

@Data
public class Image {
    private String ratio;
    private String url;
    private int width;
    private int height;
    private boolean fallback;
}
