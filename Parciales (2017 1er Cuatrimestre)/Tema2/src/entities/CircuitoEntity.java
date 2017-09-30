package entities;

import java.util.Date;
import view.CircuitoView;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CircuitoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer numero;

	private String circuito;

	private Date fechaCarrera;
	
	public CircuitoEntity(Integer numero, String circuito, Date fechaCarrera) {
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

	public Date getFechaCarrera() {
		return fechaCarrera;
	}

	public void setFechaCarrera(Date fechaCarrera) {
		this.fechaCarrera = fechaCarrera;
	}
	
	public CircuitoView toView(){
		return new CircuitoView(numero, circuito, fechaCarrera.toString());
	}
}
