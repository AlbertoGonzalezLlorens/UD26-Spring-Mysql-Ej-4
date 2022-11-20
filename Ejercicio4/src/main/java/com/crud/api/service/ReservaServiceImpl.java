package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IReservaDAO;
import com.crud.api.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService{
	
	//Utilizamos los metodos de la interface IUsuarioDAO, es como si instaciaramos.
	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> listarReserva() {
		
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva reservaXID(int id) {
		
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		
		return iReservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(int id) {
		
		iReservaDAO.deleteById(id);
		
	}

}