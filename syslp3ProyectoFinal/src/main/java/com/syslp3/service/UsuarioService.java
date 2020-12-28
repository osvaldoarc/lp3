package com.syslp3.service;

import java.util.Map;

import com.syslp3.entity.Usuario;

public interface UsuarioService {
	int create(Usuario u);
	int update(Usuario u);
	int delete(int u);
	Usuario read(int id);
	Usuario read(String nomuser);
	Usuario ValidarUsuario(String nomuser);
	Map<String, Object> datosUsuario(String username);
}

