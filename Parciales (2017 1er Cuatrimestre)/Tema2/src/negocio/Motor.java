package negocio;

import view.MotorView;

public class Motor {

	private Integer numero;
	private String descripcion;
	private int cilindrada;
	private Marca marca;
	
	public Motor(Integer numero, String descripcion, int cilindrada, Marca marca) {
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

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public MotorView toView(){
		return new MotorView(numero, descripcion, cilindrada, marca.getDescripcion());
	}
}
