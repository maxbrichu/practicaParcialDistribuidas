package view;

public class ResultadoView {
	
	private Integer numeroAuto;
	private String escuderia;
	private String motor;
	private String chasis;
	private String circuito;
	private int posicion;
	
	public ResultadoView(Integer numeroAuto, String escuderia, String motor, String chasis, String circuito, int posicion) {
		this.numeroAuto = numeroAuto;
		this.escuderia = escuderia;
		this.motor = motor;
		this.chasis = chasis;
		this.circuito = circuito;
		this.posicion = posicion;
	}

	public Integer getNumeroAuto() {
		return numeroAuto;
	}

	public void setNumeroAuto(Integer numeroAuto) {
		this.numeroAuto = numeroAuto;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public String toString(){	
		return numeroAuto + " - " + escuderia + " - " + motor + " - " + chasis 	+ " - " + circuito + " - " + posicion;
	}
}
