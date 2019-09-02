package com.gioorgi.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class SimpleCache2  {

	private static SimpleCache2 singleton;
	
	Map<String,Object> cache= Collections.synchronizedMap(new HashMap<String,Object>());
	
	private SimpleCache2(){
		
	}
	
	public static SimpleCache2 getInstance(){
		if(singleton==null){
			singleton= new SimpleCache2();
		}
		return singleton;
		
	}
	
	
	public Object get(String k){
		return cache.get(k);		
	}
	
	/**
	 * 
	 * @param k
	 * @param v
	 * @return il valore precedente
	 */
	public Object put(String k, Object v){
		return cache.put(k, v);
	}
}
