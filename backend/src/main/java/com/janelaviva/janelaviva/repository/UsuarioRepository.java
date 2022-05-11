package com.janelaviva.janelaviva.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.janelaviva.janelaviva.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	public Optional<Usuario> findByEmail(String email);
}

