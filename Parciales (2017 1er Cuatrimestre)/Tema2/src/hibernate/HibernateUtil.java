package hibernate;

import entities.AutoEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created on 27/09/2017.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    static
    {
        try
        {
            Configuration config = new Configuration();
            config.addAnnotatedClass(AutoEntity.class);
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
