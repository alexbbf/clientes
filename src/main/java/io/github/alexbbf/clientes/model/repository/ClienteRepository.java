package io.github.alexbbf.clientes.model.repository;

import io.github.alexbbf.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>{
}
