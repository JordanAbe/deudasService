package pe.edu.upc.deudasservice2.transfer;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.deudasservice2.bean.Deuda;
import pe.edu.upc.deudasservice2.bean.DeudaDetalle;
import pe.edu.upc.deudasservice2.model.DeudaDetallePK;

public class deudaTransfer {
	
	public pe.edu.upc.deudasservice2.model.Deuda getDeuda(Deuda deudaBean, int idDeuda){
		pe.edu.upc.deudasservice2.model.Deuda deuda = new pe.edu.upc.deudasservice2.model.Deuda();
		deuda.setIdDeuda(idDeuda);
		deuda.setIdDepartamento(deudaBean.getIdDepartamento());
		deuda.setIdPeriodo(deudaBean.getIdPeriodo());
		deuda.setMonto(deudaBean.getMonto());
		return deuda;
	}
	
	public List<pe.edu.upc.deudasservice2.model.DeudaDetalle> getDetalle(List<DeudaDetalle> detalleBean, int idDeuda){
		List<pe.edu.upc.deudasservice2.model.DeudaDetalle> detalle = new ArrayList<>();
		for (DeudaDetalle deudaDetalle : detalleBean) {
			detalle.add(getItemDetalle(deudaDetalle, idDeuda) );
		}
		return detalle;
	}
	
	public pe.edu.upc.deudasservice2.model.DeudaDetalle getItemDetalle(DeudaDetalle itemDetalleBean, int idDeuda){
		pe.edu.upc.deudasservice2.model.DeudaDetalle deudaDetalle = new pe.edu.upc.deudasservice2.model.DeudaDetalle();
		deudaDetalle.setId(new DeudaDetallePK(idDeuda, itemDetalleBean.getIdDetalle()));
		deudaDetalle.setIdServicio(itemDetalleBean.getIdServicio());
		deudaDetalle.setMonto(itemDetalleBean.getMonto());
		deudaDetalle.setEstado(itemDetalleBean.getEstado());
		return deudaDetalle;
	}

}
