package com.app.person;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.jk.webstack.controllers.JKWebControllerWithOrmSupport;

@ManagedBean(name="controller")
@ViewScoped
public class Controller extends JKWebControllerWithOrmSupport<Model> {
}
