package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Facultad;

public interface IFacultadService {
	
		//Metodos del CRUD
		public List<Facultad> listarFacultad(); //Listar All 
		
		public Facultad guardarFacultad(Facultad facultad);	//Guarda un Usuario CREATE
		
		public Facultad facultadXID(int codigo); //Leer datos de un Usuario READ
		
		public Facultad actualizarFacultad(Facultad facultad); //Actualiza datos del Usuario UPDATE
		
		public void eliminarFacultad(int codigo);// Elimina el Usuario DELETE

}
