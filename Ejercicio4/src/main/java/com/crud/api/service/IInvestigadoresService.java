package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Investigadores;

public interface IInvestigadoresService {
	
		//Metodos del CRUD
		public List<Investigadores> listarInvestigadores(); //Listar All 
		
		public Investigadores guardarInvestigadores(Investigadores investigadores);	//Guarda un Usuario CREATE
		
		public Investigadores investigadoresXID(String dni); //Leer datos de un Usuario READ
		
		public Investigadores actualizarInvestigadores(Investigadores investigadores); //Actualiza datos del Usuario UPDATE
		
		public void eliminarInvestigadores(String investigadores);// Elimina el Usuario DELETE

}
