/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.elementosmbc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")//api son inciales que es el co tezto general
@CrossOrigin
public class ControladorMensaje {
    
    
    @Autowired RepositorioMensaje repoMensa;
  //caso a Buscar todos   
    @GetMapping("/mensaje")
    public List<Mensaje> buscarTodos(){
    return repoMensa.findAll();
    }
    
    //caso b buscar por id
       @GetMapping("/mensaje/{id}")
    public Mensaje buscarPorId(@PathVariable String id){
        Mensaje mensa=new Mensaje();
        return repoMensa.findById(id).get();
    }
} 



