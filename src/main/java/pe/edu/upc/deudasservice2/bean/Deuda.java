package pe.edu.upc.deudasservice2.bean;

import java.util.List;

public class Deuda {
	
	private int idDeuda;
	private int idDepartamento;
	private int idPeriodo;
	private double monto;
	private List<DeudaDetalle> detalle;
	
	public int getIdDeuda() {
		return idDeuda;
	}
	public void setIdDeuda(int idDeuda) {
		this.idDeuda = idDeuda;
	}
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public int getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public List<DeudaDetalle> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<DeudaDetalle> detalle) {
		this.detalle = detalle;
	}


}
