package view;


public class CircuitoView {
	private Integer numero;
	private String circuito;
	private String fechaCarrera;
	
	public CircuitoView(Integer numero, String circuito, String fechaCarrera) {
		super();
		this.numero = numero;
		this.circuito = circuito;
		this.fechaCarrera = fechaCarrera;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public String getFechaCarrera() {
		return fechaCarrera;
	}

	public void setFechaCarrera(String fechaCarrera) {
		this.fechaCarrera = fechaCarrera;
	}
	
	public String toString(){
		return numero + " - " + circuito + " - " + fechaCarrera; 
	}
	
}
