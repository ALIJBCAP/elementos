package com.example.elementosmbc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMbcApplication implements CommandLineRunner{
@Autowired ServicioTarjeta servicio;
@Autowired RepositorioMensaje repoMensaje;
	public static void main(String[] args) {
		SpringApplication.run(ElementosMbcApplication.class, args);
                
	}

    @Override
    public void run(String... args) throws Exception {
        //LocalDate fecha=LocalDate.now();
        
        //servicio.obtenerSaldo().obtenerSaldo();
        //repoMensaje.save(new Mensaje("hola",fecha,"cerdito"));
        //buscar todos los mensajes
          // for(Mensaje mensa: repoMensaje.findAll()){
            //System.out.println(mensa);
        } 
            //buscar por id
     
            //System.out.println(repoMensaje.findByCuerpo("cerdito"));
            
            //el sigueinete es borrar            
            //Mensaje m=new  Mensaje();
            //m.setId("hola");
            //repoMensaje.delete(m);
    }


