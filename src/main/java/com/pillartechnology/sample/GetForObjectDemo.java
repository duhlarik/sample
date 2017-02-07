package com.pillartechnology.sample;

import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by jenniferkron on 2/7/17.
 */
public class GetForObjectDemo {
//    private static final Logger log = LoggerFactory.getLogger(GetForObjectDemo.class);

    public static void returnResults() {


        RestTemplate restTemplate = new RestTemplate();
        Movie movie = restTemplate.getForObject("https://api.themoviedb.org/3/movie/550?api_key=d1d4faabaa6802fede750030ddb18a2c", Movie.class);

        final List<Genre> genres = movie.getGenres();

        for (Genre genre : genres) {
            System.out.println(genre.getId());
            System.out.println(genre.getName());
        }

        System.out.println();
        System.out.println(movie.getHomepage());
    }
}
