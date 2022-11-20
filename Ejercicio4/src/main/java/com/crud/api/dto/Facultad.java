package com.crud.api.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.crud.api.dto.Reserva;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="facultad")
public class Facultad {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	
    @OneToMany
    @JoinColumn(name="facultad")
    private List<Equipos> equipo;
    @OneToMany
    @JoinColumn(name="facultad")
    private List<Investigadores> investigador;
	
	//Constructores
	
	public Facultad() {
	
	}

	public Facultad(int codigo, String nombre) {
		//super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	
	//Getters y Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	public List<Equipos> getEquipos() {
		return equipo;
	}

	public void setEquipo(List<Equipos> equipo) {
		this.equipo = equipo;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	public List<Investigadores> getInvestigadores() {
		return investigador;
	}

	public void setInvestigadores(List<Investigadores> investigador) {
		this.investigador = investigador;
	}

	//Metodo impresion de datos por consola
	
	@Override
	public String toString() {
		return "Facultad [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
}