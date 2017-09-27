package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import view.AditivoView;
import view.ComponenteView;
import view.ProductoView;
import dao.AditivoDAO;
import dao.ComponenteDAO;
import dao.ProductoDAO;
import exceptions.AditivoException;
import exceptions.ComponenteException;
import negocio.Aditivo;
import negocio.Componente;
import negocio.Composicion;
import negocio.Producto;

public class Controlador {

	private static Controlador instancia;
	private List<Componente> componentes;
	private List<Aditivo> aditivos;
	
	private Controlador(){
		 componentes = new ArrayList<Componente>();
		 aditivos = new ArrayList<Aditivo>();
	}
	
	public static Controlador getInstancia(){
		if(instancia == null)
			instancia = new Controlador();
		return instancia;
	}
	
	public void agregarProducto(ProductoView producto){
		
		Producto nuevo = new Producto();
		nuevo.setCodigoBarra(producto.getCodigoBarra());
		nuevo.setNombre(producto.getNombre());
		nuevo.setMarca(producto.getMarca());
		List<String> aditivos = producto.getAditivos();
		for(String adi : aditivos){
			Aditivo aux = null;
			try {
				aux = findAditivoByDescripcion(adi);
				nuevo.addAditivo(aux);
			} catch (AditivoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		Map<String,Float> coeficientes = producto.getCoeficientes();
		for (Entry<String, Float> e: coeficientes.entrySet()) {
			try {
				Componente aux = findComponenteByDescripcion(e.getKey());
				Composicion aux2 = new Composicion();
				aux2.setComponente(aux);
				aux2.setProducto(nuevo);
				aux2.setCantidad(e.getValue());
				nuevo.addComposicion(aux2);
			} catch (ComponenteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		nuevo.saveMe();
	}
	
	public ProductoView obtenerProducto(long codigoBarras){
		return ProductoDAO.getInstancia().findProductoByCodigo(codigoBarras).toDTO();
	}

	public Componente findComponenteByDescripcion(String descripcion) throws ComponenteException{
		if(componentes.size() == 0)
			componentes = ComponenteDAO.getInstancia().getAll();
		for(Componente c : componentes)
			if(c.soyElComponente(descripcion))
				return c;
		throw new ComponenteException("El componente " + descripcion + " no existe"); 
	}

	public Aditivo findAditivoByDescripcion(String descripcion) throws AditivoException{
		Aditivo a = AditivoDAO.getInstance().findByDescripcion(descripcion);
		if(a == null)
			throw new AditivoException("El aditivo " + descripcion + " no existe");
		else
			return a;
	}

}
