package exceptions;

/**
 * Created on 27/09/2017.
 */
public class ProductoException extends Exception {
    private static final long serialVersionUID = -8936501065611234192L;

    public ProductoException(String mensaje)
    {
        super(mensaje);
    }
}
