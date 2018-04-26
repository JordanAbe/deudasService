package pe.edu.upc.deudasservice2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="periodos")
@NamedQuery(name="Periodo.findAll", query="SELECT p FROM Periodo p")
public class Periodo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int idPeriodo;
	private String descripcion;
	
	public int getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
