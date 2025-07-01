package com.ccstudent.mslogin.Service;

import com.ccstudent.mslogin.entity.Usuario;
import com.ccstudent.mslogin.entity.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}