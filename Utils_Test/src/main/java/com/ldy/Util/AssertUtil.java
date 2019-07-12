package com.ldy.Util;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	
	public static void isTrue(boolean flag,String msg){
		if(!flag){
			throw new LRuntimeException(msg);
		}
	}
	
	public static void isFalse(boolean flag,String msg){
		if(flag){
			throw new LRuntimeException(msg);
		}
	}
	
	public static void isNotNull(String str,String msg){
		if(!(str!=null&&str!="")){
			throw new LRuntimeException(msg);
		}
	}
	
	public static void isNull(String str,String msg){
		if(str!=null&&str!=""){
			throw new LRuntimeException(msg);
		}
	}
	
	public static void isConNotNull(Collection<?> coll,String msg){
		if(coll.size()==0||coll==null){
			throw new LRuntimeException(msg);
		}
	}
	
	public static void isMapNotNull(Map<?,?> map,String msg){
		if(map.size()==0||map==null){
			throw new LRuntimeException(msg);
		}
	}
	
	public static void isStringNotNull(String str,String msg){
		if(str.trim().length()==0){
			throw new LRuntimeException(msg);
		}
	}
	
	public static void isNum(int num,String msg){
		if(num<1){
			throw new LRuntimeException(msg);
		}
	}
	
	
}
