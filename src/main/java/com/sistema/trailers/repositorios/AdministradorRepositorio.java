package com.sistema.trailers.repositorios;

import com.sistema.trailers.modelo.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepositorio extends JpaRepository<Administrador, Integer> {
    Administrador findByUsername(String username);
}

