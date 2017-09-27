package interfaces;

import dto.ProductoDTO;
import exceptions.ProductoException;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created on 27/09/2017.
 */
public interface RMIController extends Remote {

    ProductoDTO obtenerProducto(long barcode) throws RemoteException, ProductoException;
    void agregarProducto(ProductoDTO productoDTO) throws RemoteException;
}
