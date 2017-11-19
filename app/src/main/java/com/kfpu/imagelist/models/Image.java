package com.kfpu.imagelist.models;

/**
 * Created by hlopu on 19.11.2017.
 */

public class Image {
    private String name;
    private String Url;

    public Image(String name, String url) {
        this.name = name;
        Url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
