package com.ldy.service;

import java.util.List;
import java.util.Map;

import com.ldy.bean.Goods;
import com.ldy.bean.Shop;

public interface ShopService {

	public List<Shop> searchShop(Map<String, Object> map);

	public List<Goods> searchGoodsBySid(Integer sid);

	public List<Goods> searchGoods();

	public Integer addShop(Map<String, Object> map);

	public Integer deleteAll(String sids);

	public Shop searchShopById(Integer sid);

}
