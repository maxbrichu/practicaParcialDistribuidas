package entities;

import view.MotorView;

public class MotorEntity {

	private Integer numero;
	private String descripcion;
	private int cilindrada;
	private MarcaEntity marca;
	
	public MotorEntity(Integer numero, String descripcion, int cilindrada, MarcaEntity marca) {
		super();
		this.numero = numero;
		this.descripcion = descripcion;
		this.cilindrada = cilindrada;
		this.marca = marca;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public MarcaEntity getMarca() {
		return marca;
	}

	public void setMarca(MarcaEntity marca) {
		this.marca = marca;
	}
	
	public MotorView toView(){
		return new MotorView(numero, descripcion, cilindrada, marca.getDescripcion());
	}
}
