package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class ProductoEntity {
	
	@Id
	@Column(name="identificador")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer identificador;
	private long codigoBarras;
	private String nombre;
	private String marca;
	@ManyToMany
	@JoinTable(name="aditivacion", joinColumns=@JoinColumn(name="identificadorProducto"),
			  					   inverseJoinColumns=@JoinColumn(name="identificadorAditivo"))
	private List<AditivoEntity> aditivos;

	@OneToMany
	@JoinColumn(name="identificadorProducto")
	private List<ComposicionEntity> composicion;

	public List<ComposicionEntity> getComposicion() {
		return composicion;
	}

	public ProductoEntity() {
		// TODO Auto-generated constructor stub
	}

	public long getCodigoBarra() {
		return codigoBarras;
	}

	public void setCodigoBarra(long codigoBarra) {
		this.codigoBarras = codigoBarra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<AditivoEntity> getAditivos() {
		return aditivos;
	}

	public void setAditivos(List<AditivoEntity> aditivos) {
		this.aditivos = aditivos;
	}
	
	public void setComposicion(List<ComposicionEntity> composicion){
		this.composicion = composicion;
	}
}
