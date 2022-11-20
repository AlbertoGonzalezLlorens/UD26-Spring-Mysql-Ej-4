package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Equipos;

public interface IEquiposService {
	
	//Metodos del CRUD
	public List<Equipos> listarEquipos(); //Listar All 
	
	public Equipos guardarEquipos(Equipos equipos);	//Guarda un Rol CREATE
	
	public Equipos equiposXID(String numserie); //Leer datos de un Rol READ
	
	public Equipos actualizarEquipos(Equipos equipos); //Actualiza datos del Rol UPDATE
	
	public void eliminarEquipos(String numserie);// Elimina el Rol DELETE

}
