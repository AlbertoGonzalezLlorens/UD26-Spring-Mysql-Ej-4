package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IFacultadDAO;
import com.crud.api.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService{
	
	//Utilizamos los metodos de la interface IUsuarioDAO, es como si instaciaramos.
	@Autowired
	IFacultadDAO iFacultadDAO;

	@Override
	public List<Facultad> listarFacultad() {
		
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facultad) {
		
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad facultadXID(int codigo) {
		
		return iFacultadDAO.findById(codigo).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int codigo) {
		
		iFacultadDAO.deleteById(codigo);
		
	}

}