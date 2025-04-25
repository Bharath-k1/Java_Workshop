package com.xworkz.movieapp.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MovieEntity {
    //movie_id,movie_name,movie_language,movie_hero,movie_heroinel,relese_date
    private int movieId;
    private String movieName;
    private String movieLanguage;
    private String movieHero;
    private String movieHeroinel;
    private LocalDate releseDate;
}
