package view;

public class ChasisView {

	private Integer numero;
	private String descripcion;
	private String  marca;
	
	public ChasisView(Integer numero, String descripcion, String marca) {
		super();
		this.numero = numero;
		this.descripcion = descripcion;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
