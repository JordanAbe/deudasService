package pe.edu.upc.deudasservice2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DeudaDetallePK implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column(insertable=false, updatable=false)
	private int idDeuda;
	private int idDeudaDetalle;
	
	public DeudaDetallePK() {
		
	}
	
	public DeudaDetallePK(int idDeuda, int idDeudaDetalle) {
		super();
		this.idDeuda = idDeuda;
		this.idDeudaDetalle = idDeudaDetalle;
	}
	
	public int getIdDeuda() {
		return idDeuda;
	}
	public void setIdDeuda(int idDeuda) {
		this.idDeuda = idDeuda;
	}
	public int getIdDeudaDetalle() {
		return idDeudaDetalle;
	}
	public void setIdDeudaDetalle(int idDeudaDetalle) {
		this.idDeudaDetalle = idDeudaDetalle;
	}
	
	

}
