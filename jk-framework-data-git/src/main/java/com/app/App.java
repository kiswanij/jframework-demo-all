package com.app;

import java.util.List;
import java.util.UUID;

import com.app.person.DataAccess;
import com.app.person.Model;
import com.jk.core.util.JK;

public class App {

	private static String id;

	public static void main(String[] args) {
		DataAccess da = new DataAccess();
		
		add(da);
		find(da);
		update(da);
		getModelList(da);
		delete(da);
		
	}
	
	public static void add(DataAccess da) {
		Model model=new Model();
		id = UUID.randomUUID().toString();
		model.setId(id);
		da.insert(model);
	}
	
	public static void update(DataAccess da) {
		Model model = find(da);
		da.update(model);
	}

	public static Model find(DataAccess da) {
		Model model = da.find(Model.class, id);
		return model;
	}
	
	public static void delete(DataAccess da) {
		da.delete(find(da));
	}
	
	public static void getModelList(DataAccess da) {
		List<Model> modelList = da.getList(Model.class);
		JK.print("List", modelList);
	}


}
