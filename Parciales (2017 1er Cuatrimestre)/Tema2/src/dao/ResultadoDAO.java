package dao;

import entities.ResultadoEntity;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import view.ResultadoView;

import java.util.ArrayList;
import java.util.List;

public class ResultadoDAO {
    private static ResultadoDAO instancia;

    private ResultadoDAO(){}

    public static ResultadoDAO getInstance(){
        if(instancia == null)
            instancia = new ResultadoDAO();
        return instancia;
    }

    public List<ResultadoView> getAll2(){
        ArrayList<ResultadoView> views = new ArrayList<>();

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        List<ResultadoEntity> resultados = (List<ResultadoEntity>) s.createQuery("from ResultadoEntity where posicion = 1").list();

        for(ResultadoEntity re : resultados)
            views.add(re.toView());

        s.close();

        return views;
    }

    public List<ResultadoView> getAll(){
        ArrayList<ResultadoView> views = new ArrayList<>();

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        List<ResultadoEntity> resultados = (List<ResultadoEntity>) s.createQuery("from AutoEntity where AutoEntity.motor.marca.identificador = AutoEntity.chasis.marca.identificador").list();

        for(ResultadoEntity re : resultados)
            views.add(re.toView());

        s.close();

        return views;
    }

}
