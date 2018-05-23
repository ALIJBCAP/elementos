package com.example.elementosmbc;


import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T-107
 */
@SpringUI
public class MiUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
      
        VerticalLayout Layout=new VerticalLayout();
        Label etiqueta=new Label("BIENBENIDO");
                etiqueta.addStyleName(ValoTheme.LABEL_H2);
        Button boton=new Button("ingresar");
        boton.addStyleName(ValoTheme.BUTTON_DANGER);
        //AGREGAMOS ETIQUETA Y BUTTON A LAYOUT
        Layout.addComponent(etiqueta);
        Layout.addComponent(boton);
        
        setContent(Layout);
        
    }
    
}
