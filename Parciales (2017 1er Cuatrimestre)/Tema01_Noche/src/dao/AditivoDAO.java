package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entities.AditivoEntity;
import hibernate.HibernateUtil;
import negocio.Aditivo;

public class AditivoDAO {

	private static AditivoDAO instancia;
	
	private AditivoDAO(){}
	
	public static AditivoDAO getInstance(){
		if(instancia == null)
			instancia = new AditivoDAO();
		return instancia;
	}
	
	public List<Aditivo> getAll(){
		// Cosas
		List<Aditivo> resultado = new ArrayList<Aditivo>();
		Aditivo a;
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		List<AditivoEntity> aux = (List<AditivoEntity>) s.createQuery("from AditivoEntity").list();
		//Creo la lista de Aditivos
		for(AditivoEntity ae : aux)
		{
			resultado.add(this.toNegocio(ae));
		}
		s.getTransaction().commit();
		s.close();
		return resultado;

		//poronga
		//asdasd
	}
	
	public Aditivo findByDescripcion(String descripcion){
		Aditivo resultado = null;
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		AditivoEntity aux = (AditivoEntity) s.createQuery("from AditivoEntity where descripcion = ?").setString(0, descripcion).uniqueResult();
		resultado = this.toNegocio(aux);
		s.getTransaction().commit();
		s.close();
		return resultado;
	}
	
	public void save(Aditivo aditivo){
		AditivoEntity objeto = this.toEntity(aditivo);
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(objeto);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	
	public AditivoEntity toEntity(Aditivo aditivo){
		return new AditivoEntity(aditivo.getId(), aditivo.getDescripcion(), aditivo.getValor());
	}
	
	public Aditivo toNegocio(AditivoEntity obtenido){
		return new Aditivo(obtenido.getId(), obtenido.getDescripcion(), obtenido.getValor());
	}
}
