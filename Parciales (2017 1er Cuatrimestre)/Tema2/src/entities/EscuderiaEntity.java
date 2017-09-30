package entities;

import view.EscuderiaView;

import javax.persistence.*;

@Entity
@Table(name = "escuderias")
public class EscuderiaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numero;

	private String descripcion;
	
	public EscuderiaEntity(Integer numero, String descripcion) {
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
	
	public EscuderiaView toView(){
		return new EscuderiaView(numero, descripcion);
	}
	
}
