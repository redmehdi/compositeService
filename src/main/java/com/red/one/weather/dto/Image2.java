package com.red.one.weather.dto;

import lombok.Data;

@Data
public class Image2 {
    public String ratio;
    public String url;
    public int width;
    public int height;
    public boolean fallback;
    public String attribution;
}
