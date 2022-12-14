package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Matricula;

public interface IMatriculaRepository {
	
	//CRUD
	public void insertar(Matricula matricula);
	public Matricula buscar(String numero);
	public void actualizar(Matricula matricula);
	public void eliminar(String numero);
}
