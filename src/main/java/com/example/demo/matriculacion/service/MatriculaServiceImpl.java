package com.example.demo.matriculacion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		
		//Valores minimos para generar la matricula
		Matricula matricula=new Matricula();
		Propietario propietario=this.iPropietarioService.buscar(cedula);
		Vehiculo vehiculo=this.iVehiculoService.buscar(placa);
		BigDecimal valorMatricula=null;
		
		matricula.setFecha(LocalDateTime.now());
		
		if(vehiculo.getTipo().equals("pesado")) {
			valorMatricula=vehiculo.getPrecio().multiply(new BigDecimal(0.15));
		}else if (vehiculo.getTipo().equals("liviano")) {
			valorMatricula=vehiculo.getPrecio().multiply(new BigDecimal(0.15));
		}

		if(valorMatricula.compareTo(new BigDecimal(2000))<0) {
			valorMatricula=valorMatricula.subtract(valorMatricula.multiply(new BigDecimal(0.07)));
		}
		matricula.setValor(valorMatricula);
		matricula.setPropietario(propietario);
		matricula.setVehiculo(vehiculo);
		System.out.println("Se ha generado la matricula"+matricula);
	}

}
