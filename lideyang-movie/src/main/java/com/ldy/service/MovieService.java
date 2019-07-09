package com.ldy.service;

import java.util.List;
import java.util.Map;

import com.ldy.bean.Movie;

public interface MovieService {

	public List<Movie> searchMovie(Map<String, Object> map);

	public Movie searchMovieById(Integer id);

	public Integer updateMtype(Integer id);

}
