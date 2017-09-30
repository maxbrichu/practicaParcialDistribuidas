package entities;

import view.ResultadoView;

import javax.persistence.*;

@Entity
@Table(name ="resultados")
public class ResultadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer identificador;

	@ManyToOne
	private AutoEntity auto;

	@ManyToOne
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
