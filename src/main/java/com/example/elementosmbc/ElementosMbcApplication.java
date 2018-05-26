package com.example.elementosmbc;

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
        servicio.obtenerSaldo().obtenerSaldo();
        repoMensaje.save(new Mensaje("Mi primer mensaje"));
    }
}
