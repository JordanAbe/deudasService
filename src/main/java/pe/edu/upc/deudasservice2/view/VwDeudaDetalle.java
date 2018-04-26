package pe.edu.upc.deudasservice2.view;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VwDeudaDetalle {
	
	@Id
	private int idDetalle;
	private int idDeuda;
	private int idServicio;
	private String servicio;
	private double monto;
	private String estado;
	
	public VwDeudaDetalle() {
		super();
	}
	public int getIdDetalle() {
		return idDetalle;
	}
	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}
	public int getIdDeuda() {
		return idDeuda;
	}
	public void setIdDeuda(int idDeuda) {
		this.idDeuda = idDeuda;
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
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "VwDeudaDetalle [idDetalle=" + idDetalle + ", idDeuda=" + idDeuda + ", idServicio=" + idServicio
				+ ", servicio=" + servicio + ", monto=" + monto + "]";
	}

}
