package com.ldy.mapper;

import java.util.List;
import java.util.Map;

import com.ldy.bean.Goods;
import com.ldy.bean.Shop;

public interface ShopDao {

	public List<Shop> searchShop(Map<String, Object> map);

	public List<Goods> searchGoodsBySid(Integer sid);

	public List<Goods> searchGoods();

	public Integer addShop(Map<String, Object> map);

	public Integer searchSid(String sname);

	public void addShop_gids(int parseInt, Integer sid);

	public void deleteAll(int parseInt);

	public Shop searchShopById(Integer sid);

}
