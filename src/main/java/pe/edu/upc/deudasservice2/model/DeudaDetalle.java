package pe.edu.upc.deudasservice2.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="deuda_detalle")
public class DeudaDetalle implements Serializable{

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private DeudaDetallePK id;
	private int idServicio;
	private double monto;
	private String estado;
	
	public DeudaDetalle() {
		
	}
	
	public DeudaDetalle(DeudaDetallePK id, int idServicio, double monto) {
		super();
		this.id = id;
		this.idServicio = idServicio;
		this.monto = monto;
	}

	public DeudaDetallePK getId() {
		return id;
	}
	public void setId(DeudaDetallePK id) {
		this.id = id;
	}
	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
