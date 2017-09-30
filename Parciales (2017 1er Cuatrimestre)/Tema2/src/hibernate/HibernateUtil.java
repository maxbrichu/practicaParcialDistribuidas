package hibernate;

import entities.*;
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

            config.addAnnotatedClass(ChasisEntity.class);
            config.addAnnotatedClass(EscuderiaEntity.class);
            config.addAnnotatedClass(MarcaEntity.class);
            config.addAnnotatedClass(MotorEntity.class);
            config.addAnnotatedClass(AutoEntity.class);
            config.addAnnotatedClass(ResultadoEntity.class);
            config.addAnnotatedClass(CircuitoEntity.class);

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
