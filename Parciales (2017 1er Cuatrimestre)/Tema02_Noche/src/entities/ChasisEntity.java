package entities;

import view.ChasisView;

public class ChasisEntity {

	private Integer numero;
	private String descripcion;
	private MarcaEntity marca;
	
	public ChasisEntity(){ }
	
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
	public MarcaEntity getMarca() {
		return marca;
	}
	public void setMarca(MarcaEntity marca) {
		this.marca = marca;
	}
	
	public ChasisView toView(){
		return new ChasisView(numero, descripcion, marca.getDescripcion());
	}
}
