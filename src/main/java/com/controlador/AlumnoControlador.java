package com.controlador;

import com.Modelo.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoControlador {

	@GetMapping("/eventos")
	public Alumno listar() {
		return new Alumno("UTPL", "Procesos de Ingeniería de Software", "René Ludeña R", "Abr/Ago 2021", "Python", "Trabajar como desarrollador");
	}

}
