package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {

	//CRUD
	public void insertar(Propietario propietario);

	public Propietario buscar(String cedula);

	public void actualizar(Propietario propietario);

	public void eliminar(String cedula);
}
