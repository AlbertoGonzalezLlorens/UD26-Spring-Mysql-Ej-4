package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Reserva;

public interface IReservaService {
	
		//Metodos del CRUD
		public List<Reserva> listarReserva(); //Listar All 
		
		public Reserva guardarReserva(Reserva reserva);	
		
		public Reserva reservaXID(int id); //Leer datos de un Usuario READ
		
		public Reserva actualizarReserva(Reserva reserva); //Actualiza datos del Usuario UPDATE
		
		public void eliminarReserva(int id);// Elimina el Usuario DELETE

}
