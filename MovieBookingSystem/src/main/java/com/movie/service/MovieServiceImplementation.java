package com.movie.service;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.entity.MovieInfo;
import com.movie.repository.MovieRepository;


@Service
public class MovieServiceImplementation implements MovieServiceInterface {

	@Autowired
	MovieRepository mrepo;
	
	
	
	
	@Override
	public List<MovieInfo> displayMovies() {
		// TODO Auto-generated method stub
		List<MovieInfo> result=mrepo.findAll();
		return result;
	}
	
	@Override
	public MovieInfo addmovies(MovieInfo movie) {
		// TODO Auto-generated method stub
		return mrepo.save(movie);
	}
	
	@Override
	public void deleteMovies() {
		// TODO Auto-generated method stub
		 mrepo.deleteAll();
	}

	
	
}
