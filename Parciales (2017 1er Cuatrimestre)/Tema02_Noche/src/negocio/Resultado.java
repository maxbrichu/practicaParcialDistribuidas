package negocio;

import view.ResultadoView;

public class Resultado {

	private Auto auto;
	private Circuito circuito;
	private int posicion;
	
	public Resultado(Auto auto, Circuito circuito, int posicion) {
		this.auto = auto;
		this.circuito = circuito;
		this.posicion = posicion;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Circuito getCircuito() {
		return circuito;
	}

	public void setCircuito(Circuito circuito) {
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
