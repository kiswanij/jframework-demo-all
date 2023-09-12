package com.app.person;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import com.jk.services.server.JKAbstractRestController;

@Path("/example")
public class Controller extends JKAbstractRestController{

	@Path("hello")
	@GET
	public String sayHello() {
		return "Hello from uncle Jalal";
	}

	@GET
	@Path("/hello/{name}")
	public String sayHelloWithPathParam(@PathParam(value = "name") String name) {
		return "Hello, " + name;
	}

	@POST
	@Path("/hello")
	public String sayHelloWithBody(Model p) {
		return "Hello, " + p.getName() + ", your age is: " + p.getAge();
	}
	
	@PATCH
	@Path("/hello")
	public String sayHelloWithBodyPatch(Model p) {
		return "Hello from Patch, " + p.getName() + ", your age is: " + p.getAge();
	}
}