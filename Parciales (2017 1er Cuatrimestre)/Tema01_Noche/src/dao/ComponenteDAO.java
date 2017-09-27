package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.ComponenteEntity;
import hibernate.HibernateUtil;
import negocio.Componente;

public class ComponenteDAO {
	
	private static ComponenteDAO instancia;
	
	private ComponenteDAO() {}
	
	public static ComponenteDAO getInstancia(){
		if(instancia == null)
			instancia = new ComponenteDAO();
		return instancia;
	}
	
	public List<Componente> getAll(){
		List<Componente> resultado = new ArrayList<Componente>();	
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		List<ComponenteEntity> componentes = (List<ComponenteEntity>) s.createQuery("from ComponenteEntity order by descripcion").list();
		for(ComponenteEntity ce : componentes)
			resultado.add(toNegocio(ce));
		s.getTransaction().commit();
		s.close();
		return resultado;
	}
	
	public Componente toNegocio(ComponenteEntity obtenido){
		return new Componente(obtenido.getIdentificador(), obtenido.getDescripcion(), obtenido.getCoeficiente());
		
	}
}
