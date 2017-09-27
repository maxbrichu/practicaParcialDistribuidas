import Config.RMIConfig;
import dto.ProductoDTO;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created on 27/09/2017.
 */
public class RMIController {

    private static RMIController controller;
    private RMIController remoteController;

    public static RMIController getInstance() {
        if (controller == null) controller = new RMIController();
        return controller;
    }

    public void conectar() throws RemoteException, NotBoundException, MalformedURLException {
        remoteController = (RMIController) Naming.lookup (RMIConfig.URL);
    }


    private RMIController(){

    }

    public ProductoDTO getProductByBarcode(String barcode) {
        return remoteController.getProductByBarcode(barcode);
    }

    public void crearProducto(ProductoDTO productoDTO){
        remoteController.crearProducto(productoDTO);
    }

}
