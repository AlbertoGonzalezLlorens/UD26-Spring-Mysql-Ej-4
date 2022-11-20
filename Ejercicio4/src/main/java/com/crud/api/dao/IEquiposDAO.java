package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Equipos;

public interface IEquiposDAO extends JpaRepository<Equipos, String>{

}
