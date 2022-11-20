package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IEquiposDAO;
import com.crud.api.dto.Equipos;


@Service
public class EquiposServiceImpl implements IEquiposService{
	
	//Utilizamos los metodos de la interface IRolDAO, es como si instaciaramos.
	@Autowired
	IEquiposDAO iEquiposDAO;

	@Override
	public List<Equipos> listarEquipos() {
		
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipos guardarEquipos(Equipos equipos) {
		
		return iEquiposDAO.save(equipos);
	}

	@Override
	public Equipos equiposXID(String numserie) {
		
		return iEquiposDAO.findById(numserie).get();
	}

	@Override
	public Equipos actualizarEquipos(Equipos equipos) {
		
		return iEquiposDAO.save(equipos);
	}

	@Override
	public void eliminarEquipos(String numserie) {
		
		iEquiposDAO.deleteById(numserie);
		
	}

}