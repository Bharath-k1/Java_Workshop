package com.xworkz.movieapp.repo;

import com.xworkz.movieapp.entity.MovieEntity;

public interface MovieRepo {
    void saveMovie(MovieEntity entity);
    void readMovie();


}
