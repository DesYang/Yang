package com.ldy.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.ldy.Util.AssertUtil;
import com.ldy.Util.LRuntimeException;

public class ClassTest {
	
	@Test
	public void Ut1(){
		try {
			AssertUtil.isTrue(false, "这不是true");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void Ut2(){
		try {
			AssertUtil.isFalse(true, "这不是false");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void Ut3(){
		try {
			AssertUtil.isNotNull("", "这是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void Ut4(){
		try {
			AssertUtil.isNull("", "这不是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void Ut5(){
		try {
			ArrayList<String> list = new ArrayList<String>();
			list.add("dadad");
			AssertUtil.isConNotNull(list, "这是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void Ut6(){
		try {
			Map<String, Object> map = new HashMap<String,Object>();
			/*map.put("111", 111);*/
			AssertUtil.isMapNotNull(map, "这是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void Ut7(){
		try {
			AssertUtil.isStringNotNull("", "这是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void Ut8(){
		try {
			AssertUtil.isNum(10, "这不是正数");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
