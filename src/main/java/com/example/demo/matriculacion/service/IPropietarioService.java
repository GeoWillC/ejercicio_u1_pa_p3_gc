package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.modelo.Propietario;

public interface IPropietarioService {
	
	public void agregar(Propietario propietario);

	public Propietario buscar(String cedula);

	public void actualizar(Propietario propietario);

	public void eliminar(String cedula);
}
