package com.ldy.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldy.bean.Movie;
import com.ldy.mapper.MovieDao;

@Service
public class MovieServiceImpl implements MovieService{

	@Resource
	private MovieDao dao;

	@Override
	public List<Movie> searchMovie(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.searchMovie(map);
	}

	@Override
	public Movie searchMovieById(Integer id) {
		// TODO Auto-generated method stub
		return dao.searchMovieById(id);
	}

	@Override
	public Integer updateMtype(Integer id) {
		// TODO Auto-generated method stub
		return dao.updateMtype(id);
	}
	
	
}
