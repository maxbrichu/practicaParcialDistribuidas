package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aditivos")
public class AditivoEntity {
	
	@Id
	public String id;
	public String descripcion;
	@Column(name="puntaje")
	public float valor;
	
	public AditivoEntity() {}
	
	public AditivoEntity(String id, String descripcion, float valor) {
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
}
