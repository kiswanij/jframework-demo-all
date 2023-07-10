package com.app.person;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.jk.web.faces.controllers.JKWebController;

@ManagedBean(name="controller")
@ViewScoped
public class Controller extends JKWebController{
	private ServiceClient client = new ServiceClient();
	private Person model;

	public String sayHello() {
		String msg=client.callSayHello();
		success(msg);
		return null;
	}

	public String sayHelloWithName() {
		String msg=client.callSayHelloWithName(getModel().getName());
		success(msg);
		return null;
	}
	
	public String sayHelloWithObject() {
		String msg=client.callSayHelloWithObject(getModel());
		success(msg);
		return null;
	}
	
	public Person getModel() {
		if (model == null) {
			model = new Person();
		}
		return model;
	}

	public void setModel(Person model) {
		this.model = model;
	}

}
