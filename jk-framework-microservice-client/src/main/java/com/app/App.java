package com.app;

import com.jk.core.util.JK;
import com.jk.services.client.JKServiceClient;

public class App {
	public static void main(String[] args) {
		String url = "http://localhost:8080/app/example";
		JKServiceClient<Person> client = new JKServiceClient<>(url, Person.class);

		String response = client.callJsonAsString("/hello");
		JK.print(response);

		String response2 = client.callJsonAsString("/hello/Jalal");
		JK.print(response2);

		Person p = new Person();
		p.setName("Jalal");
		p.setAge(40);

		String response3 = client.callJsonWithPost("/hello", p);
		JK.print(response3);

		String response4 = client.callJsonWithPatch("/hello", p);
		JK.print(response4);
	}
}
