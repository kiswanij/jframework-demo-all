package com.app;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.jk.web.faces.controllers.JKWebController;

@Named("controller")
@ViewScoped
public class Controller extends JKWebController {
	String name;

	public String sayHello() {
		success("Hello, " + name);
		return null;// return to the same page when the action finish
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
