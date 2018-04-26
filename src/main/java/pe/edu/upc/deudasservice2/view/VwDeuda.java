package pe.edu.upc.deudasservice2.view;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class VwDeuda {

	@Id
	private int idDeuda;
	private int idDepartamento;
	private int idPeriodo;
	private double monto;
	private String departamento;
	private String periodo;
	@Transient private List<VwDeudaDetalle> detalle;
	
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
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public List<VwDeudaDetalle> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<VwDeudaDetalle> detalle) {
		this.detalle = detalle;
	}
	
}
