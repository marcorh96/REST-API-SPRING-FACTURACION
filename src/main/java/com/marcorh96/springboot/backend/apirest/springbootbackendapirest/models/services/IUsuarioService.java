package com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.services;

import com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username); 
}
