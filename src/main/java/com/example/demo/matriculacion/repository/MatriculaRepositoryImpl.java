package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	private static List<Matricula> baseDeDatos = new ArrayList<>();

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		baseDeDatos.add(matricula);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println();
		return null;
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub

	}

}
