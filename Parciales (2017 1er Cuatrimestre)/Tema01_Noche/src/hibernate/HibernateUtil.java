package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entities.AditivoEntity;
import entities.ComponenteEntity;
import entities.ComposicionEntity;
import entities.ProductoEntity;

 
public class HibernateUtil
{
    private static final SessionFactory sessionFactory;
    static
    {
        try
        {
        	 AnnotationConfiguration config = new AnnotationConfiguration();
             config.addAnnotatedClass(ComponenteEntity.class);
             config.addAnnotatedClass(AditivoEntity.class);
             config.addAnnotatedClass(ProductoEntity.class);
             config.addAnnotatedClass(ComposicionEntity.class);
             sessionFactory = config.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed. -->" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
