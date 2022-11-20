package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Facultad;

public interface IFacultadDAO extends JpaRepository<Facultad, Integer>{

}
