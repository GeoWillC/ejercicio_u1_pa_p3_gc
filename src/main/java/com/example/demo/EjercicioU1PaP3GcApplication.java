package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.service.IMatriculaService;
import com.example.demo.matriculacion.service.IPropietarioService;
import com.example.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class EjercicioU1PaP3GcApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3GcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("PC1222");
		vehiculo.setPrecio(new BigDecimal(200));
		vehiculo.setTipo("liviano");
		iVehiculoService.agregar(vehiculo);
		vehiculo.setMarca("Suzuki");
		vehiculo.setPlaca("AC4123");
		this.iVehiculoService.actualizar(vehiculo);
		Propietario propietario=new Propietario();
		propietario.setApellido("Conlago");
		propietario.setCedula("1751242669");
		propietario.setFechaNacimiento(LocalDateTime.of(1999,12,21, 12, 1));
		propietario.setNombre("Willian");
		this.iPropietarioService.agregar(propietario);
		
		iMatriculaService.generar(propietario.getCedula(), vehiculo.getPlaca());
		
	}

}
