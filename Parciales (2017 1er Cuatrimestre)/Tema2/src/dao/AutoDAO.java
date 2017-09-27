package dao;

import entities.AutoEntity;
import negocio.Auto;

/**
 * Created on 27/09/2017.
 */
public class AutoDAO {
    private static AutoDAO instancia;

    private AutoDAO(){}

    public static AutoDAO getInstance(){
        if(instancia == null)
            instancia = new AutoDAO();
        return instancia;
    }

    public Auto toNegocio(AutoEntity autoEntity){
        Auto aux = new Auto(autoEntity.getNuemroAuto(),autoEntity.getChasis(), autoEntity.getMotor(), autoEntity.getEscuderia());

    }
}
