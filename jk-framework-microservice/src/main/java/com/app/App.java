package com.app;

import javax.ws.rs.ApplicationPath;

import com.jk.services.server.JKServiceConfig;
import com.jk.web.embedded.JKWebApplication;

@ApplicationPath("app")
public class App extends JKServiceConfig{
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JKWebApplication.run(8080,false);
	}

}
