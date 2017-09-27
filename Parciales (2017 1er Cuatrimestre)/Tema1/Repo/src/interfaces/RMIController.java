package interfaces;

import dto.ProductoDTO;

import java.rmi.Remote;

/**
 * Created on 27/09/2017.
 */
public interface RMIController extends Remote {

    ProductoDTO getProductByBarcode(String barcode);
    void nuevoProducto(ProductoDTO productoDTO);
}
