package view;

public class MarcaView {
	
	private Integer numero;
	private String descripcion;
	
	public MarcaView(Integer numero, String descripcion) {
		this.numero = numero;
		this.descripcion = descripcion;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String toString(){
		return this.numero + " - " + this.descripcion;
	}
	
}
