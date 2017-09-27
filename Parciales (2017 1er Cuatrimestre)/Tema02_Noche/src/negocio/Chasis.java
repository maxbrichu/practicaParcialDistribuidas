package negocio;

import view.ChasisView;

public class Chasis {

	private Integer numero;
	private String descripcion;
	private Marca marca;
	
	public Chasis(){ }
	
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
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public ChasisView toView(){
		return new ChasisView(numero, descripcion, marca.getDescripcion());
	}
}
