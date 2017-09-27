package negocio;

import view.AutoView;

public class Auto {
	
	private Integer numeroAuto;
	private Chasis chasis;
	private Motor motor;
	private Escuderia escuderia;
	
	public Auto(Integer nuemroAuto, Chasis chasis, Motor motor, Escuderia escuderia) {
		super();
		this.numeroAuto = nuemroAuto;
		this.chasis = chasis;
		this.motor = motor;
		this.escuderia = escuderia;
	}

	public Integer getNuemroAuto() {
		return numeroAuto;
	}

	public void setNuemroAuto(Integer nuemroAuto) {
		this.numeroAuto = nuemroAuto;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Escuderia getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(Escuderia escuderia) {
		this.escuderia = escuderia;
	}
	
	public AutoView toView(){
		return new AutoView(numeroAuto, chasis.getDescripcion(), motor.getDescripcion(), escuderia.getDescripcion());
	}
	
}
