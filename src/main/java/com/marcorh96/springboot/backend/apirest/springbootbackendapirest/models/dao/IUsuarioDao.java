package com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
    
    public Usuario findByUsername(String username); 

    /* @Query("SELECT u from usuario u where u.username=?1")
    public Usuario findByUsername2(String username);  */
}
