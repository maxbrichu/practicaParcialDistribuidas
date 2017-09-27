package dao;

import entities.ResultadoEntity;
import hibernate.HibernateUtil;
import negocio.Resultado;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 27/09/2017.
 */
public class ResultadoDAO {
    private static ResultadoDAO instancia;

    private ResultadoDAO(){}

    public static ResultadoDAO getInstance(){
        if(instancia == null)
            instancia = new ResultadoDAO();
        return instancia;
    }

    public List<Resultado> getAll(){
        List<Resultado> resultado = new ArrayList<Resultado>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        List<ResultadoEntity> resultados = (List<ResultadoEntity>) s.createQuery("from ResultadoEntity order by descripcion").list();
        for(ResultadoEntity re : resultados)
            resultado.add(toNegocio(re));
        s.getTransaction().commit();
        s.close();
        return resultado;
    }

    public Resultado toNegocio(ResultadoEntity obtenido){
        return new Resultado(obtenido.getAuto(), obtenido.getCircuito().toView(), obtenido.getPosicion());

    }
}
