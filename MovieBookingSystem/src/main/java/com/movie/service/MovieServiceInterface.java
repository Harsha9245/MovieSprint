package com.movie.service;

import java.sql.ResultSet;
import java.util.List;


import com.movie.entity.MovieInfo;


public interface MovieServiceInterface {

	List<MovieInfo> displayMovies();

	MovieInfo addmovies(MovieInfo movie);

	void deleteMovies();

}
