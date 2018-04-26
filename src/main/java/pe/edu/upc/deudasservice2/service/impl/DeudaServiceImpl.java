package pe.edu.upc.deudasservice2.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.deudasservice2.bean.Deuda;
import pe.edu.upc.deudasservice2.dao.GenericDao;
import pe.edu.upc.deudasservice2.service.DeudaService;
import pe.edu.upc.deudasservice2.transfer.deudaTransfer;
import pe.edu.upc.deudasservice2.view.VwDeuda;
import pe.edu.upc.deudasservice2.view.VwDeudaDetalle;

@Service
public class DeudaServiceImpl implements DeudaService {

	@Autowired
	GenericDao dao;

	@Override
	public String insertDeuda(Deuda deuda) {
		int idDeuda = 0;
		deudaTransfer transfer = new deudaTransfer();
		try {
			idDeuda = dao.ultimo("idDeuda", "Deuda") + 1;
			dao.insert(transfer.getDeuda(deuda, idDeuda), transfer.getDetalle(deuda.getDetalle(), idDeuda));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return String.valueOf(idDeuda);
	}

	@Override
	public List<VwDeuda> getDeudas(Integer id, Integer idper, String dep, String tel) {
		List<VwDeuda> vwDeudas = null;
		if(dep!=null && dep.isEmpty()){
			dep = null;
		}
		if(tel!=null && tel.isEmpty()){
			tel = null;
		}
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		params.put("idper", idper);
		params.put("dep", dep);
		params.put("tel", tel);
		try {
			vwDeudas = dao.getDeudas(params);
			if(id != null && vwDeudas.size() > 0){
				vwDeudas.get(0).setDetalle(dao.sp_deuda_detalle(id));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vwDeudas;
	}

	@Override
	public VwDeuda getDeuda(Integer id) {
		VwDeuda vwDeuda = null;
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		try {
			if (dao.getDeudas(params).size() > 0) {
				vwDeuda = dao.getDeudas(params).get(0);
				vwDeuda.setDetalle(dao.sp_deuda_detalle(vwDeuda.getIdDeuda()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vwDeuda;
	}

}
