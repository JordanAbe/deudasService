package pe.edu.upc.deudasservice2.service;

import java.util.List;

import pe.edu.upc.deudasservice2.model.Departamento;
import pe.edu.upc.deudasservice2.model.Periodo;
import pe.edu.upc.deudasservice2.model.Servicio;

public interface GenericService {
	
	List<Periodo> getPeriodos();
	List<Departamento> getDepartamentos();
	List<Servicio> getServicios();

}
