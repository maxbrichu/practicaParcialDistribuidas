package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="composicion")
public class ComposicionEntity {

	@Id
	@Column(name="identificador")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer itemComposicion;
	@ManyToOne
	@JoinColumn(name="identificadorProducto")
	private ProductoEntity producto;
	@ManyToOne
	@JoinColumn(name="identificadorComponente")
	private ComponenteEntity componente;
	private float cantidad;
	
	public ComposicionEntity() {}
	
	public ComposicionEntity(Integer itemComposicion, ProductoEntity producto, ComponenteEntity componente, float cantidad) {
		this.itemComposicion = itemComposicion;
		//this.producto = producto;
		this.componente = componente;
		this.cantidad = cantidad;
	}
	
	public Integer getItemComposicion() {
		return itemComposicion;
	}
	
	public void setItemComposicion(Integer itemComposicion) {
		this.itemComposicion = itemComposicion;
	}
	
/*	public ProductoEntity getProducto() {
		return producto;
	}
	*/
	public void setProducto(ProductoEntity producto) {
		this.producto = producto;
	}
	
	public ComponenteEntity getComponente() {
		return componente;
	}
	
	public void setComponente(ComponenteEntity componente) {
		this.componente = componente;
	}
	
	public float getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
}
