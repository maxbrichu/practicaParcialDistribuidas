package dao;

import entities.AutoEntity;
import negocio.Auto;
import negocio.Chasis;

/**
 * Created on 27/09/2017.
 */
public class ChasisDAO {
    private static ChasisDAO instancia;

    private ChasisDAO(){}

    public static ChasisDAO getInstance(){
        if(instancia == null)
            instancia = new ChasisDAO();
        return instancia;
    }

    public Chasis toNegocio(AutoEntity chasisEntity){
        Chasis aux = new Chasis();

    }
}
