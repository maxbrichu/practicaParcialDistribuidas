package negocio;

import view.AditivoView;
import dao.AditivoDAO;

public class Aditivo {

	public String id;
	public String descripcion;
	public float valor;
	
	public Aditivo(String id, String descripcion, float valor) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public void save(){
		AditivoDAO.getInstance().save(this);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public AditivoView toDTO(){
		return new AditivoView(id, descripcion, valor);
	}

}
