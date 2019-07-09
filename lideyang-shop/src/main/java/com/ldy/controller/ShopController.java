package com.ldy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldy.bean.Goods;
import com.ldy.bean.Shop;
import com.ldy.service.ShopService;

@Controller
public class ShopController {

	@Resource
	private ShopService service;
	
	@RequestMapping("/list.do")
	public ModelAndView searchShop(String sname,@RequestParam(defaultValue="1",required=false)Integer pageNum){
		
		PageHelper.startPage(pageNum, 4);
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		map.put("sname", sname);
		List<Shop> list = service.searchShop(map);
		for (Shop shop : list) {
			Integer sid = shop.getSid();
			List<Goods> list1 = service.searchGoodsBySid(sid);
			String str = "";
			for (Goods goods : list1) {
				String gname = goods.getGname();
				str+=","+gname;
			}
			String substring = str.substring(1);
			shop.setGnames(substring);
		}
		
		PageInfo<Shop> page = new PageInfo<Shop>(list);
		int lastPage = page.getLastPage();
		int nextPage = page.getNextPage();
		int prePage = page.getPrePage();

		
		ModelAndView av = new ModelAndView();
		
		av.setViewName("list");
		
		av.getModelMap().put("page", page);
		av.getModelMap().put("lastPage", lastPage);
		av.getModelMap().put("nextPage", nextPage);
		av.getModelMap().put("prePage", prePage);
		
		return av;
	}
	
	@ResponseBody
	@RequestMapping("/searchGoods.do")
	public List<Goods> searchGoods(){
		List<Goods> list = service.searchGoods();
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/addShop.do")
	public Integer addShop(String gids,String sname,String sdate){
		System.out.println(sdate+sdate);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("gids", gids);
		map.put("sname", sname);
		map.put("sdate", sdate);
		Integer num = service.addShop(map);
		return num;
	}
	
	@ResponseBody
	@RequestMapping("/deleteAll.do")
	public Integer deleteAll(String sids){
		Integer num = service.deleteAll(sids);
		
		return num;
	}
	
	@ResponseBody
	@RequestMapping("/searchShopById.do")
	public Shop searchShopById(Integer sid){
		Shop shop = service.searchShopById(sid);
		List<Goods> list1 = service.searchGoodsBySid(sid);
		String str = "";
		for (Goods goods : list1) {
			String gname = goods.getGname();
			str+=","+gname;
		}
		String substring = str.substring(1);
		shop.setGnames(substring);
		
		return shop;
	}
	
}
