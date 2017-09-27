package view;

public class AditivoView {

	public String id;
	public String descripcion;
	public float valor;
	
	public AditivoView() {}
	
	public AditivoView(String id, String descripcion, float valor) {
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
