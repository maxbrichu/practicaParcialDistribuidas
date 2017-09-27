package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.ComposicionEntity;
import hibernate.HibernateUtil;
import negocio.Composicion;

public class ComposicionDAO {

	private static ComposicionDAO instancia;
	
	private ComposicionDAO(){}
	
	public static ComposicionDAO getInstancia(){
		if(instancia == null)
			instancia = new ComposicionDAO();
		return instancia;
	}
	
	public List<Composicion> getAll(){
		List<Composicion> resultado = new ArrayList<Composicion>();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		List<ComposicionEntity> aux = (List<ComposicionEntity>) s.createQuery("from ComposicionEntity").list();
		for(ComposicionEntity ce : aux)
		{
			System.out.println(ce.getComponente().getDescripcion() + " - " + ce.getCantidad());
		}
		s.getTransaction().commit();
		s.close();
		return resultado;
	}

	public Composicion toNegocio(ComposicionEntity obtenido) {
		
		return new Composicion(obtenido.getItemComposicion(), 
												null, 
												ComponenteDAO.getInstancia().toNegocio(obtenido.getComponente()), 
												obtenido.getCantidad());
	}
}
