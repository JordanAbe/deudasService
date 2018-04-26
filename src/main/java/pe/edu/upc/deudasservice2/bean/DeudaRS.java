package pe.edu.upc.deudasservice2.bean;

import java.util.List;

import pe.edu.upc.deudasservice2.view.VwDeuda;

public class DeudaRS {
	
	private String status;
	private String message;
	private List<VwDeuda> deudas;

	public List<VwDeuda> getDeudas() {
		return deudas;
	}

	public void setDeudas(List<VwDeuda> deudas) {
		this.deudas = deudas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
