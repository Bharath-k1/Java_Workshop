package com.xworkz.movieapp.Servlet;

import com.xworkz.movieapp.entity.MovieEntity;
import com.xworkz.movieapp.repo.MovieRepo;
import com.xworkz.movieapp.repo.MovieRepoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/save")
public class MovieServlet extends HttpServlet {
    public MovieServlet() {}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MovieEntity entity = new MovieEntity();
        entity.setMovieName(req.getParameter("movie_name"));
        entity.setMovieLanguage(req.getParameter("movie_language"));
        entity.setMovieHero(req.getParameter("movie_hero"));
        entity.setMovieHeroinel(req.getParameter("movie_heroinel"));
        entity.setReleseDate(LocalDate.parse(req.getParameter("relese_date")));
        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(entity);
        PrintWriter write=resp.getWriter();
        write.print(entity.getMovieName()+":Movie saved");


    }
}
