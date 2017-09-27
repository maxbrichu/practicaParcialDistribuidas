package negocio;

public class Composicion {

	private Integer itemComposicion;
	private Producto producto;
	private Componente componente;
	private float cantidad;
	
	public Composicion(Integer itemComposicion, Producto producto, Componente componente, float cantidad) {
		super();
		this.itemComposicion = itemComposicion;
		this.producto = producto;
		this.componente = componente;
		this.cantidad = cantidad;
	}

	public Composicion() { }

	public Integer getItemComposicion() {
		return itemComposicion;
	}

	public void setItemComposicion(Integer itemComposicion) {
		this.itemComposicion = itemComposicion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
		
	}
}
