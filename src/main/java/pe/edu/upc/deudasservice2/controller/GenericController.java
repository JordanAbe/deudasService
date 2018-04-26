package pe.edu.upc.deudasservice2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.deudasservice2.model.Departamento;
import pe.edu.upc.deudasservice2.model.Periodo;
import pe.edu.upc.deudasservice2.model.Servicio;
import pe.edu.upc.deudasservice2.service.GenericService;

@RestController
public class GenericController {
	
	@Autowired
	GenericService service;
	
	@GetMapping("/periodos")
	public ResponseEntity<List<Periodo>> getPeriodos(){
		List<Periodo> periodos = service.getPeriodos();
		return new ResponseEntity<List<Periodo>>(periodos, HttpStatus.OK);
	}
	
	@GetMapping("/departamentos")
	public ResponseEntity<List<Departamento>> getDepartamentos(){
		List<Departamento> departamentos = service.getDepartamentos();
		return new ResponseEntity<List<Departamento>>(departamentos, HttpStatus.OK);
	}
	
	@GetMapping("/servicios")
	public ResponseEntity<List<Servicio>> getServicios(){
		List<Servicio> servicios = service.getServicios();
		return new ResponseEntity<List<Servicio>>(servicios, HttpStatus.OK);
	}

}
