package view;


public class AutoView {

	private Integer numeroAuto;
	private String chasis;
	private String motor;
	private String escuderia;
	
	public AutoView(Integer numeroAuto, String chasis, String motor, String escuderia) {
		super();
		this.numeroAuto = numeroAuto;
		this.chasis = chasis;
		this.motor = motor;
		this.escuderia = escuderia;
	}

	public Integer getNumeroAuto() {
		return numeroAuto;
	}

	public void setNumeroAuto(Integer numeroAuto) {
		this.numeroAuto = numeroAuto;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	
	public String toString(){
		return numeroAuto  + " - " + escuderia + " - " + chasis  + " - " + motor;
	}
}
