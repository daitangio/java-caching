package com.gioorgi.cache;

import java.util.HashMap;
import java.util.Map;

public final class SimpleCache  {

	private static SimpleCache singleton;
	
	Map<String,Object> cache= new HashMap<String,Object>();
	
	private SimpleCache(){
		
	}
	
	public static SimpleCache getInstance(){
		if(singleton==null){
			singleton= new SimpleCache();
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
