package pe.edu.upc.deudasservice2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.deudasservice2.dao.GenericDao;
import pe.edu.upc.deudasservice2.model.Departamento;
import pe.edu.upc.deudasservice2.model.Periodo;
import pe.edu.upc.deudasservice2.model.Servicio;
import pe.edu.upc.deudasservice2.service.GenericService;

@Service
public class GenericServiceImpl implements GenericService{

	@Autowired
	GenericDao dao;

	@SuppressWarnings("unchecked")
	@Override
	public List<Periodo> getPeriodos() {
		List<Periodo> periodos = null;
		try {
			 periodos = (List<Periodo>) dao.findByNamedQuery("Periodo.findAll");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return periodos;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Departamento> getDepartamentos() {
		List<Departamento> departamentos = null;
		try {
			departamentos = (List<Departamento>) dao.findByNamedQuery("Departamento.findAll");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return departamentos;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> getServicios() {
		List<Servicio> servicios = null;
		try {
			servicios = (List<Servicio>) dao.findByNamedQuery("Servicio.findAll");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return servicios;
	}
	


}
