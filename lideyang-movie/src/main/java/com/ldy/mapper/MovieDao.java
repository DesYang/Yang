package com.ldy.mapper;

import java.util.List;
import java.util.Map;

import com.ldy.bean.Movie;

public interface MovieDao {

	List<Movie> searchMovie(Map<String, Object> map);

	Movie searchMovieById(Integer id);

	Integer updateMtype(Integer id);

}
