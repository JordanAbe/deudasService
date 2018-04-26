package pe.edu.upc.deudasservice2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deuda")
public class Deuda implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int idDeuda;
	private int idDepartamento;
	private int idPeriodo;
	private double monto;
	
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

}
