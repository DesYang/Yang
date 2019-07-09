package com.ldy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ldy.bean.Movie;
import com.ldy.service.MovieService;

@Controller
public class MovieController {
	
	Integer num = 0;
	@Resource
	private MovieService service;
	
	@RequestMapping("/list.do")
	public ModelAndView searchMovie(Integer flag,String mname){
		System.out.println(mname);
		Map<String, Object> map = new HashMap<String,Object>();
		
		num++;
		
		map.put("flag", flag);
		map.put("num", num);
		map.put("mname", mname);
		
		List<Movie> list = service.searchMovie(map);
		for (Movie movie : list) {
			if(movie.getMtype()==0){
				movie.setTyname("已下架");
			}else if(movie.getMtype()==1){
				movie.setTyname("正在热映");
			}else if(movie.getMtype()==2){ 
				movie.setTyname("即将下架");
			}
		}
		
		ModelAndView av = new ModelAndView();
		
		av.setViewName("list");
		
		av.getModelMap().put("list", list);
		
		return av;
	}
	
	@ResponseBody
	@RequestMapping("/searchMovieById.do")
	public Movie searchMovieById(Integer id){
		Movie movie = service.searchMovieById(id);
		
		return movie;
	}
	
	@ResponseBody
	@RequestMapping("/updateMtype.do")
	public Integer updateMtype(Integer id){
		Integer num = service.updateMtype(id);
		
		return num;
	}
}
