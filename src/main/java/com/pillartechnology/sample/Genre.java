package com.pillartechnology.sample;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jenniferkron on 2/7/17.
 */
public class Genre {
    private int id;
    private String name;

    @JsonProperty
    public int getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
}
