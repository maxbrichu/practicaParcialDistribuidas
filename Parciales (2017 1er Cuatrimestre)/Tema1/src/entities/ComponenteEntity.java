package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="componentes")
public class ComponenteEntity implements Serializable{

	private static final long serialVersionUID = -4011008088216100704L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer identificador;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="coeficiente")
	private float coeficiente;
	
	public ComponenteEntity() {	}
	
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getCoeficiente() {
		return coeficiente;
	}
	public void setCoeficiente(float coeficiente) {
		this.coeficiente = coeficiente;
	}
}
