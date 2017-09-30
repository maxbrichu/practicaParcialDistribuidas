package entities;

import view.MarcaView;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MarcaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer numero;

	private String descripcion;
	
	public MarcaEntity(Integer numero, String descripcion) {
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
	
	public MarcaView toView(){
		return new MarcaView(numero, descripcion);
	}
	
}
