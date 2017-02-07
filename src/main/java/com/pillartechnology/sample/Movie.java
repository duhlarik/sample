package com.pillartechnology.sample;

import java.util.List;

/**
 * Created by jenniferkron on 2/7/17.
 */
public class Movie {

//    @JsonProperty("genres")
    private List<Genre> genres;

//    @JsonProperty("homepage")
    private String homepage;

    public List<Genre> getGenres() {
        return genres;
    }

    public String getHomepage() {
        return homepage;
    }
}
