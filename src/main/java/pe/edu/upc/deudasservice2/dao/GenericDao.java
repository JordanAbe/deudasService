package pe.edu.upc.deudasservice2.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import pe.edu.upc.deudasservice2.view.VwDeuda;
import pe.edu.upc.deudasservice2.view.VwDeudaDetalle;

public interface GenericDao {
	
	List<?> findByNamedQuery(String queryName) throws Exception;
	int ultimo(String id, String objeto) throws Exception;
	void insert(Object object, Collection<?> collection) throws Exception;
	List<VwDeuda> getDeudas(Map<String, Object> params) throws Exception;
	List<VwDeudaDetalle> sp_deuda_detalle(int iddeu) throws Exception;
	

}
