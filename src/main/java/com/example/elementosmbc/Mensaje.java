/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.elementosmbc;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Mensaje {
    @Id
    String id;
    
    LocalDate Fecha;
    String cuerpo;

    public Mensaje(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Mensaje() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
   
    
}
