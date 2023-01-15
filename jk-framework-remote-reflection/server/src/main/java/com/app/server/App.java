package com.app.server;

import com.jk.core.reflection.server.ReflectionServer;

public class App {
	
	public static void main(String[] args) {
		ReflectionServer server = new ReflectionServer(7125);
		server.start();
	}
}