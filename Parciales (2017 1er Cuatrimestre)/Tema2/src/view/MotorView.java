package view;

public class MotorView {

	
	private Integer numero;
	private String descripcion;
	private int cilindrada;
	private String marca;
	
	public MotorView(Integer numero, String descripcion, int cilindrada, String marca) {
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String toString(){
		return numero + " - " + descripcion + " - " + cilindrada + " - " + marca; 
		
	}
}
