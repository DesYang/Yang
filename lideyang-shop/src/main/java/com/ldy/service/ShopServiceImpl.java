package com.ldy.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldy.bean.Goods;
import com.ldy.bean.Shop;
import com.ldy.mapper.ShopDao;

@Service
public class ShopServiceImpl implements ShopService{

	@Resource
	private ShopDao dao;

	@Override
	public List<Shop> searchShop(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.searchShop(map);
	}

	@Override
	public List<Goods> searchGoodsBySid(Integer sid) {
		// TODO Auto-generated method stub
		return dao.searchGoodsBySid(sid);
	}

	@Override
	public List<Goods> searchGoods() {
		// TODO Auto-generated method stub
		return dao.searchGoods();
	}

	@Override
	public Integer addShop(Map<String, Object> map) {
		// TODO Auto-generated method stub
		Integer num = dao.addShop(map);
		String gids = (String) map.get("gids");
		String[] gid = gids.split(",");
		String sname = (String) map.get("sname");
		Integer sid = dao.searchSid(sname);
		for (String string : gid) {
			dao.addShop_gids(Integer.parseInt(string),sid);
		}
		
		return num;
	}

	@Override
	public Integer deleteAll(String sids) {
		// TODO Auto-generated method stub
		String[] split = sids.split(",");
		for (String string : split) {
			dao.deleteAll(Integer.parseInt(string));
		}
		return 1;
	}

	@Override
	public Shop searchShopById(Integer sid) {
		// TODO Auto-generated method stub
		return dao.searchShopById(sid);
	}
	
}
