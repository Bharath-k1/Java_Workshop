package com.xworkz.movieapp.repo;

import com.xworkz.movieapp.entity.MovieEntity;

import java.sql.*;
import java.time.LocalDate;

public class MovieRepoImpl implements MovieRepo {
    @Override
    public void saveMovie(MovieEntity entity){
    String urls="jdbc:mysql://localhost:3307/moviedata";
    String username="root";
    String psw="Bkms@8088";

    String query="insert into movie_info(movie_id,movie_name,movie_language,movie_hero,movie_heroinel,relese_date)"+"values(?,?,?,?,?,?)";

    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(urls,username,psw);
            PreparedStatement Statement=connection.prepareStatement(query);
            Statement.setInt(1,entity.getMovieId());
            Statement.setString(2,entity.getMovieName());
            Statement.setString(2,entity.getMovieName());
            Statement.setString(3,entity.getMovieLanguage());
            Statement.setString(4,entity.getMovieHero());
            Statement.setString(5,entity.getMovieHeroinel());
            Statement.setDate(6, Date.valueOf(entity.getReleseDate()));
            Statement.execute();

            System.out.println(entity.getMovieName()+ "Data is saved");


    } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readMovie() {
        String urls="jdbc:mysql://localhost:3307/moviedata";
        String username="root";
        String psw="Bkms@8088";

        String query="select *from movie_info";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(urls,username,psw);
            PreparedStatement Statement=connection.prepareStatement(query);
            ResultSet set = Statement.executeQuery();
            while (set.next()){
//                movie_id, movie_name, movie_language, movie_hero, movie_heroinel, relese_date
               System.out.println(set.getInt("movie_id"));
                System.out.println(set.getString("movie_name"));
                System.out.println(set.getString("movie_language"));
                System.out.println(set.getString("movie_hero"));
                System.out.println(set.getString("movie_heroinel"));

            }

   } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    }

