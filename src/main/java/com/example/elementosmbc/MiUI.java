package com.example.elementosmbc;


import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

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
@Autowired RepositorioMensaje repoMensaje;
     @Override
    protected void init(VaadinRequest request) {
//poner el orden de arriba a abajo 

        VerticalLayout layout=new VerticalLayout();
        Label etiqueta=new Label("hola");
        etiqueta.addStyleName(ValoTheme.LABEL_H2);
                
        // A container that is 100% wide by default
        VerticalLayout dos = new VerticalLayout();
        Label label1 = new Label("jiji");
        dos.addStyleName(ValoTheme.LABEL_H3);
        
        
        
      
       
        
        //METER CAMPO DE TEXTO
        TextField texto=new TextField();
        texto.setPlaceholder("");
        Button boton=new Button("GUARDAR MENSAJE");
        boton.addStyleName(ValoTheme.BUTTON_DANGER);
        
        //MANEJAMOS EL EVENTGO DE TIPO BOTON
        boton.addClickListener(algo->{
            String cuerpo= texto.getValue();//variable local
            //guardamos 
            repoMensaje.save(new Mensaje(cuerpo));
            //le comunicamos al usuario un mensajito que se guardo
            Notification.show("MENSAJE GUARDADO", Notification.Type.ERROR_MESSAGE);
             }
        );
        
        //CASO:BUSCAR TODOS
        Grid<Mensaje> grid = new Grid<>();
       
        grid.setItems(repoMensaje.findAll());

     grid.addColumn(Mensaje::getId).setCaption("id");
     grid.addColumn(Mensaje::getCuerpo).setCaption("cuerpo");
    
        
        //agregamos la etiueta y el boton a el layout 
        layout.addComponent(etiqueta);
        layout.addComponent(boton);
        layout.addComponent(texto);
        
        //AGREGAMOS DICHA COMPONENTE A NUESTR LAYOUT
        
        layout.addComponent(grid);
        //finalmente agregamos el layout al contenedor principal de init
        setContent(layout);
    }


    
}
