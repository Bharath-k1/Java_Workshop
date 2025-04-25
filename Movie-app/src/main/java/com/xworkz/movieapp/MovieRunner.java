package com.xworkz.movieapp;

import com.xworkz.movieapp.entity.MovieEntity;
import com.xworkz.movieapp.repo.MovieRepo;
import com.xworkz.movieapp.repo.MovieRepoImpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args) {

        MovieEntity movieEntity = new MovieEntity();
//        movieEntity.setMovieId(2);
        movieEntity.setMovieName("KALKI");
        movieEntity.setMovieHero("Prabas");
        movieEntity.setMovieHeroinel("saptami shetty");
        movieEntity.setMovieLanguage("tamil");
        movieEntity.setReleseDate(LocalDate.of(2021,5,18));
        MovieRepo repo=new MovieRepoImpl();
//            repo.saveMovie(movieEntity);
        repo.readMovie();

    }
}
