package pe.edu.upc.deudasservice2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.deudasservice2.bean.Deuda;
import pe.edu.upc.deudasservice2.bean.DeudaRS;
import pe.edu.upc.deudasservice2.service.DeudaService;
import pe.edu.upc.deudasservice2.view.VwDeuda;

@RestController
public class DeudaController {

	@Autowired
	DeudaService service;

	@PostMapping("/deudas")
	public ResponseEntity<String> insertDeuda(@RequestBody Deuda deuda) {
		String codigo = service.insertDeuda(deuda);
		return new ResponseEntity<String>(codigo, HttpStatus.CREATED);
	}

	@GetMapping("/deudas")
	public ResponseEntity<DeudaRS> getDeudas(
			@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "idper", required = false) Integer idper,
			@RequestParam(value = "dep", required = false) String dep,
			@RequestParam(value = "tel", required = false) String tel) {
		
		System.out.println(idper + " " + dep + " " + tel);
		List<VwDeuda> deudas = service.getDeudas(id, idper, dep, tel);
		DeudaRS deudaRS = new DeudaRS();
		deudaRS.setDeudas(deudas);
		if(deudas.size() > 0){
			deudaRS.setStatus("ok");	
		}else{
			deudaRS.setStatus("error");
			deudaRS.setMessage("Sin resultados");
		}
		return new ResponseEntity<DeudaRS>(deudaRS, HttpStatus.OK);
	}

	@GetMapping("/deudas/{id}")
	public ResponseEntity<DeudaRS> getDeudas(@PathVariable int id) {
		VwDeuda deuda = service.getDeuda(id);
		DeudaRS deudaRS = new DeudaRS();
		List<VwDeuda> deudas = new ArrayList<>();
		deudas.add(deuda);
		deudaRS.setDeudas(deudas);
		if(deudas.size() > 0){
			deudaRS.setStatus("ok");	
		}else{
			deudaRS.setStatus("error");
			deudaRS.setMessage("Sin resultados");
		}
		return new ResponseEntity<DeudaRS>(deudaRS, HttpStatus.OK);
	}

}
