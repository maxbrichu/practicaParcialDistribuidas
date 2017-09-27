package entities;

import view.ResultadoView;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="resultado")
public class ResultadoEntity {

	private AutoEntity auto;
	private CircuitoEntity circuito;
	private int posicion;
	
	public ResultadoEntity(AutoEntity auto, CircuitoEntity circuito, int posicion) {
		this.auto = auto;
		this.circuito = circuito;
		this.posicion = posicion;
	}

	public AutoEntity getAuto() {
		return auto;
	}

	public void setAuto(AutoEntity auto) {
		this.auto = auto;
	}

	public CircuitoEntity getCircuito() {
		return circuito;
	}

	public void setCircuito(CircuitoEntity circuito) {
		this.circuito = circuito;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public ResultadoView toView(){
		return new ResultadoView(auto.getNuemroAuto(), auto.getEscuderia().getDescripcion(), auto.getMotor().getDescripcion(), auto.getChasis().getDescripcion(), circuito.getCircuito(), posicion);
	}
}
