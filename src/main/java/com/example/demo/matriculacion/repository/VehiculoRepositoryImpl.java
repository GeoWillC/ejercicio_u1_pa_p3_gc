package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	private static List<Vehiculo> baseDeDatos = new ArrayList<>();

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		baseDeDatos.add(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		for (Vehiculo v : baseDeDatos) {
			if (v.getPlaca().equals(placa))
				;
			vehiculo = v;
		}
		return vehiculo;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha  cambiado los datos del vehiculo " + vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.buscar(placa);
		baseDeDatos.remove(vehiculo);
	}

}
