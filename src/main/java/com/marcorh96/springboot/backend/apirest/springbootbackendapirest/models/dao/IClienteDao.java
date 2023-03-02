package com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import com.marcorh96.springboot.backend.apirest.springbootbackendapirest.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

    @Query("FROM Region")
    public List<Region> findAllRegiones();
}
