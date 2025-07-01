package com.ccstudent.mslogin.repository;

import com.ccstudent.mslogin.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    public Usuario findByUsername(String username);
}