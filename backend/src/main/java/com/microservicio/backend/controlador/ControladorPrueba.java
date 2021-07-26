package com.microservicio.backend.controlador;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class ControladorPrueba {

	@Value("${variable}")
	private String variable;

	@GetMapping(path = "/obtener_parametro")
	public String obtenerParametro() {
		return variable;
	}

}
