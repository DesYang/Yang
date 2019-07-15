package com.ldy.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.ldy.utils.AssertUtil;
import com.ldy.utils.LRuntimeException;

public class ClassTest {
	
	@Test
	public void test1(){
		try {
			AssertUtil.isTrue(true, "这是假的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		try {
			AssertUtil.isFalse(true, "这是真的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3(){
		try {
			AssertUtil.notNull("", "这是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void test4(){
		try {
			AssertUtil.isNull("dadada", "这不是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void test5(){
		try {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(5);
			AssertUtil.notEmpty(arr, "这个集合是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void test6(){
		try {
			Map<String, Object> map = new HashMap<String,Object>();
			map.put("ada", 123);
			AssertUtil.notMap(map, "这个map是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void test7(){
		try {
			AssertUtil.hasText("     ", "这个字符串是空的");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void test8(){
		try {
			BigDecimal bigDecimal = new BigDecimal("5");
			AssertUtil.greaterThanZero(bigDecimal, "这个值小于等于0");
		} catch (LRuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}
