package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	private List<Propietario> baseDeDatos = new ArrayList<>();

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDeDatos.add(propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propietario = new Propietario();
		for (Propietario p : baseDeDatos) {
			if (p.getCedula().equals(cedula))
				;
			propietario = p;
		}
		return propietario;
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el propietario" + propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Propietario propietario = this.buscar(cedula);

		baseDeDatos.remove(propietario);
	}

}
