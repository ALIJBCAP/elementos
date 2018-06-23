/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.elementosmbc;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    //caso c)guardar   
    @PostMapping("/mensaje")    
    public Estatus guardar(@RequestBody String json)throws Exception{
    //primero  convertimos este string json a un objeto java
    ObjectMapper maper=new ObjectMapper();
    Mensaje mensa= maper.readValue(json,Mensaje.class);
    repoMensa.save(mensa);
        System.out.println("Este objeto se convirtio:"+mensa);
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito!!");
        return estatus;
    }
        //caso c)actualizar  
    @PutMapping("/mensaje")    
    public Estatus actualizar(@RequestBody String json)throws Exception{
    ObjectMapper maper=new ObjectMapper();
    Mensaje mensa= maper.readValue(json,Mensaje.class);
    repoMensa.save(mensa);
        System.out.println("Este objeto se convirtio:"+mensa);
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito!!");
        return estatus;
                
    }
    //CASO BORRAR
    @DeleteMapping("/mensaje/{id}")
    public Estatus borrarPoRid(@PathVariable String id){
        Mensaje mensa=new Mensaje();
        repoMensa.deleteById(id);
        Estatus e=new Estatus();
        e.setSuccess(true);
        e.setMensaje("Mensaje borrado con exito");
        return e;
    }
    
    
    
}


