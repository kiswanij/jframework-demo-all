package com.app.client;

import com.jk.core.reflection.client.ReflectionClient;
import com.jk.core.reflection.common.MethodCallInfo;

public class App {
	public static void main(String[] args) {
		ReflectionClient client=new ReflectionClient("localhost", 7125);
		MethodCallInfo info=new  MethodCallInfo("com.app.server.Service", "hello", "Jalal");
		client.callMethod(info);
		
		String result = (String) info.getResult();
		System.out.println(result);
	}
}
