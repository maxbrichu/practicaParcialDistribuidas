package dao;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import negocio.Aditivo;
import negocio.Composicion;
import negocio.Producto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import view.ProductoView;
import entities.AditivoEntity;
import entities.ComponenteEntity;
import entities.ComposicionEntity;
import entities.ProductoEntity;

public class ProductoDAO {

	private static ProductoDAO instancia;
	
	private ProductoDAO() {}
	
	public static ProductoDAO getInstancia(){
		if(instancia == null)
			instancia = new ProductoDAO();
		return instancia;
	}
	
	public Producto findProductoByCodigo(Long codigoBarras){
		Producto resultado = null;
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		ProductoEntity aux = (ProductoEntity) s.createQuery("select pe from ProductoEntity pe inner join pe.aditivos inner join pe.composicion where codigoBarras = ?").setLong(0, codigoBarras).uniqueResult();
		resultado = this.toNegocio(aux);
		s.getTransaction().commit();
		s.close();
		return resultado;
	}
	
	public ProductoView findProductoByCodigoToView(Long codigoBarras){
		ProductoView resultado = null;
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		ProductoEntity aux = (ProductoEntity) s.createQuery("select pe from ProductoEntity pe inner join pe.aditivos inner join pe.composicion where codigoBarras = ?").setLong(0, codigoBarras).uniqueResult();
		s.getTransaction().commit();
		s.close();
		return resultado;
	}
	
	public void save(Producto producto){
		ProductoEntity objeto = this.toEntity(producto);
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(objeto);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public ProductoEntity toEntity(Producto producto){
		ProductoEntity nuevo = new ProductoEntity();
		nuevo.setCodigoBarra(producto.getCodigoBarra());
		nuevo.setNombre(producto.getNombre());
		nuevo.setMarca(producto.getMarca());
		List<AditivoEntity> aux1 = new ArrayList<AditivoEntity>();
		List<Aditivo> aditivos = producto.getAditivos();
		for(Aditivo a : aditivos)
			aux1.add(AditivoDAO.getInstance().toEntity(a));
		List<ComposicionEntity> aux2 = new ArrayList<ComposicionEntity>();
		List<Composicion> composiciones = producto.getComposicion();
		for(Composicion c : composiciones){
			ComposicionEntity ce = new ComposicionEntity();
			ce.setCantidad(c.getCantidad());
			ComponenteEntity compEntity = new ComponenteEntity();
			compEntity.setIdentificador(c.getComponente().getIdentificador());
			compEntity.setDescripcion(c.getComponente().getDescripcion());
			compEntity.setCoeficiente(c.getComponente().getCoeficiente());
			ce.setComponente(compEntity);
			ce.setProducto(nuevo);
		}
		nuevo.setAditivos(aux1);
		nuevo.setComposicion(aux2);
		return nuevo;
	}
	
	public Producto toNegocio(ProductoEntity recuperado){
		Producto aux = new Producto();
		aux.setCodigoBarra(recuperado.getCodigoBarra());
		aux.setNombre(recuperado.getNombre());
		aux.setMarca(recuperado.getMarca());
		for(AditivoEntity ae : recuperado.getAditivos())
			aux.addAditivo(AditivoDAO.getInstance().toNegocio(ae));
		for(ComposicionEntity ce: recuperado.getComposicion())
			aux.addComposicion(ComposicionDAO.getInstancia().toNegocio(ce));
		return aux;	
	}
}
