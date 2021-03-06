package view;



public class ComponenteView{

	private Integer identificador;
	private String descripcion;
	private float coeficiente;
	
	public ComponenteView() {}
	
	public ComponenteView(Integer identificador, String descripcion, float coeficiente) {
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
	
	public String toString(){
		return this.identificador + " - " + this.descripcion + " - " + this.coeficiente;
	}
}

