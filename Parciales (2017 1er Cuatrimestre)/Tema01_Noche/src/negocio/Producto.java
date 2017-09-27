package negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import view.ProductoView;
import controlador.Controlador;
import dao.ProductoDAO;
import exceptions.ComponenteException;

public class Producto {

	private long codigoBarra;
	private String nombre;
	private String marca;
	private List<Aditivo> aditivos;
	private List<Composicion> composicion;
	private Map<Componente, Float> auxiliar;

	public Producto () {
		this.aditivos = new ArrayList<Aditivo>();
		this.composicion = new ArrayList<Composicion>();	
	}
	
	public Producto(long codigoBarra, String nombre, String marca, float porcion, float carbohidratos, float azucares,
			float proteinas, float fibra, float sodio, float colesterol, float totales, float saturadas, float trans,
			float mono, float poli) {
		this.codigoBarra = codigoBarra;
		this.nombre = nombre;
		this.marca = marca;
		this.aditivos = new ArrayList<Aditivo>();
		this.composicion = new ArrayList<Composicion>();	
	}
	
	public float obtenerX(){
		this.auxiliar = new HashMap<Componente, Float>();
		Componente aux, aux1;
		float resultado =  0;
		for(Composicion c : composicion)
			auxiliar.put(c.getComponente(), c.getCantidad());
		try {
			aux = Controlador.getInstancia().findComponenteByDescripcion("azucares");
			resultado += auxiliar.get(aux) * aux.getCoeficiente();
			aux = Controlador.getInstancia().findComponenteByDescripcion("proteinas");
			resultado += auxiliar.get(aux) * aux.getCoeficiente();
			aux = Controlador.getInstancia().findComponenteByDescripcion("saturadas");
			resultado += auxiliar.get(aux) * aux.getCoeficiente();
			aux = Controlador.getInstancia().findComponenteByDescripcion("trans");
			resultado += auxiliar.get(aux) * aux.getCoeficiente();
			aux = Controlador.getInstancia().findComponenteByDescripcion("fibra");
			resultado += auxiliar.get(aux) * aux.getCoeficiente();
			aux = Controlador.getInstancia().findComponenteByDescripcion("sodio");
			resultado += auxiliar.get(aux) * aux.getCoeficiente() / 1000;
			aux = Controlador.getInstancia().findComponenteByDescripcion("colesterol");
			resultado += auxiliar.get(aux) * aux.getCoeficiente() / 1000; 
			aux = Controlador.getInstancia().findComponenteByDescripcion("carbohidratos");
			aux1 = Controlador.getInstancia().findComponenteByDescripcion("azucares");
			resultado += (auxiliar.get(aux) - auxiliar.get(aux1)) * aux.getCoeficiente();
			aux = Controlador.getInstancia().findComponenteByDescripcion("totales");
			aux1 = Controlador.getInstancia().findComponenteByDescripcion("saturadas");
			resultado += (auxiliar.get(aux) - auxiliar.get(aux1)) * aux.getCoeficiente();
		} catch (ComponenteException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public float obtenerY(){
		float resultado = 0f;
		for(Aditivo a : aditivos)
			resultado += a.getValor() / 2;
		return resultado;
	}

	public void addAditivo(Aditivo aditivo){
		aditivos.add(aditivo);
	}

	public void addComposicion(Composicion componente){
		composicion.add(componente);
	}
	
	public void saveMe(){
		ProductoDAO.getInstancia().save(this);
	}
	
	public long getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(long codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<Aditivo> getAditivos() {
		return aditivos;
	}

	public List<Composicion> getComposicion() {
		return composicion;
	} 
		
	public ProductoView toDTO(){
		ProductoView aux = new ProductoView(codigoBarra, nombre, marca);
		for(Aditivo a : aditivos)
			aux.setAditivo(a.getDescripcion());
		for(Composicion c : composicion)
			aux.setCoeficiente(c.getComponente().getDescripcion(), c.getCantidad());
		return aux; 
	}
}
