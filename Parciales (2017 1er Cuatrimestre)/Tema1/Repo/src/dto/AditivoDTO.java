package dto;

import java.io.Serializable;

public class AditivoDTO implements Serializable{

	private static final long serialVersionUID = 2406017130462727044L;
	public String id;
	public String descripcion;
	public float valor;
	
	public AditivoDTO() {}
	
	public AditivoDTO(String id, String descripcion, float valor) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String toString(){
		return this.id + " - " + this.descripcion;
	}
}
