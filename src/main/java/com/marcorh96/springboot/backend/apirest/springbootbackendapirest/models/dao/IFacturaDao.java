package com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{
    
}
