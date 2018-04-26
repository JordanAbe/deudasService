package pe.edu.upc.deudasservice2.service;

import java.util.List;

import pe.edu.upc.deudasservice2.bean.Deuda;
import pe.edu.upc.deudasservice2.view.VwDeuda;

public interface DeudaService {
	
	String insertDeuda(Deuda deuda);
	List<VwDeuda> getDeudas(Integer id,Integer idper, String dep, String tel);
	VwDeuda getDeuda(Integer id);

}
