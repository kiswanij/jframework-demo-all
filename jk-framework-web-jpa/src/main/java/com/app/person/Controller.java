package com.app.person;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.jk.webstack.controllers.JKWebControllerWithOrmSupport;

@Named("controller")
@ViewScoped
public class Controller extends JKWebControllerWithOrmSupport<Model> {
}
