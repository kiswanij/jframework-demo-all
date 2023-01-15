package com.app.cache;

import com.jk.core.cache.JKCacheFactory;
import com.jk.core.cache.JKCacheManager;
import com.jk.core.util.JK;

public class JKCacheExample {
	public static void main(String[] args) {
		//Cache value
		JKCacheManager cm = JKCacheFactory.getCacheManager();
		cm.cache("username", "Jalal");
		
		//Retrieve value
		String value = cm.get("username", String.class);
		JK.print(value);
		
		//Remove value
		cm.remove("username", String.class);
		
		String value2 = cm.get("username", String.class);
		JK.print(value2);//null
		
	}
}
