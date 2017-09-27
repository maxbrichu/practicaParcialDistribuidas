package negocio;

import view.ComponenteView;

public class Componente {
	
	private Integer identificador;
	private String descripcion;
	private float coeficiente;
	
	public Componente(Integer identificador, String descripcion, float coeficiente) {
		super();
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.coeficiente = coeficiente;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(float coeficiente) {
		this.coeficiente = coeficiente;
	}
	
	public boolean soyElComponente(String descripcion){
		return this.descripcion.equalsIgnoreCase(descripcion);
				
	}
	
	public ComponenteView toDTO(){
		return new ComponenteView(identificador, descripcion, coeficiente);
	}
}
