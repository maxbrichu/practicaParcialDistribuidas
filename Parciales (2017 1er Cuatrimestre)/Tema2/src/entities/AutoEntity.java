package entities;

import view.AutoView;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "autos")
public class AutoEntity {

	@Id
	private Integer numeroAuto;

	private ChasisEntity chasis;

	private MotorEntity motor;

	private EscuderiaEntity escuderia;
	
	public AutoEntity(Integer nuemroAuto, ChasisEntity chasis, MotorEntity motor, EscuderiaEntity escuderia) {
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

	public ChasisEntity getChasis() {
		return chasis;
	}

	public void setChasis(ChasisEntity chasis) {
		this.chasis = chasis;
	}

	public MotorEntity getMotor() {
		return motor;
	}

	public void setMotor(MotorEntity motor) {
		this.motor = motor;
	}

	public EscuderiaEntity getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(EscuderiaEntity escuderia) {
		this.escuderia = escuderia;
	}
	
	public AutoView toView(){
		return new AutoView(numeroAuto, chasis.getDescripcion(), motor.getDescripcion(), escuderia.getDescripcion());
	}
	
}
