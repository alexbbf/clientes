package io.github.alexbbf.clientes;

import io.github.alexbbf.clientes.model.entity.Cliente;
import io.github.alexbbf.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.zip.CRC32;

@SpringBootApplication
public class ClientesApplication {



    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
