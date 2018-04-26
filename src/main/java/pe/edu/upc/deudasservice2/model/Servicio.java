package pe.edu.upc.deudasservice2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="servicios")
@NamedQuery(name="Servicio.findAll", query="SELECT p FROM Servicio p")
public class Servicio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_servicio")
	private int idServicio;
	private String descripcion;
	
	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
