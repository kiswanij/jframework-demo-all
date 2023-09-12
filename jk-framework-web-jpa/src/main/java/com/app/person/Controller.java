package com.app.person;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import com.jk.webstack.controllers.JKWebControllerWithOrmSupport;

@Named("controller")
@ViewScoped
public class Controller extends JKWebControllerWithOrmSupport<Model> {
}
