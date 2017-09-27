package view;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ProductoView{

	private long codigoBarra;
	private String nombre;
	private String marca;
	private Map<String, Float> coeficientes;
	private List<String> aditivos;
	private float porcion, carbohidratos, azucares, proteinas, fibra, sodio, colesterol;
	private float totales, saturadas, trans, mono, poli;

	public ProductoView() { 
		this.coeficientes = new HashMap<String, Float>();
		this.aditivos = new ArrayList<String>();
	}
	
	public ProductoView(long codigoBarra, String nombre, String marca) {

		this.codigoBarra = codigoBarra;
		this.nombre = nombre;
		this.marca = marca; 
		this.coeficientes = new HashMap<String, Float>();
		this.aditivos = new ArrayList<String>();
		
	}
	
	public long getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(long codigoBarra) {
		this.codigoBarra = codigoBarra;
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

	public Map<String, Float> getCoeficientes() {
		return coeficientes;
	}

	public void setCoeficiente(String componente, Float cantidad){
		coeficientes.put(componente, cantidad);
	}
	
	public List<String> getAditivos() {
		return aditivos;
	}

	public void setAditivo(String aditivo){
		aditivos.add(aditivo);
	}
	
	public float getPorcion() {
		return porcion;
	}

	public void setPorcion(float porcion) {
		this.porcion = porcion;
	}

	public float getCarbohidratos() {
		return carbohidratos;
	}

	public void setCarbohidratos(float carbohidratos) {
		this.carbohidratos = carbohidratos;
	}

	public float getAzucares() {
		return azucares;
	}

	public void setAzucares(float azucares) {
		this.azucares = azucares;
	}

	public float getProteinas() {
		return proteinas;
	}

	public void setProteinas(float proteinas) {
		this.proteinas = proteinas;
	}

	public float getFibra() {
		return fibra;
	}

	public void setFibra(float fibra) {
		this.fibra = fibra;
	}

	public float getSodio() {
		return sodio;
	}

	public void setSodio(float sodio) {
		this.sodio = sodio;
	}

	public float getColesterol() {
		return colesterol;
	}

	public void setColesterol(float colesterol) {
		this.colesterol = colesterol;
	}

	public float getTotales() {
		return totales;
	}

	public void setTotales(float totales) {
		this.totales = totales;
	}

	public float getSaturadas() {
		return saturadas;
	}

	public void setSaturadas(float saturadas) {
		this.saturadas = saturadas;
	}

	public float getTrans() {
		return trans;
	}

	public void setTrans(float trans) {
		this.trans = trans;
	}

	public float getMono() {
		return mono;
	}

	public void setMono(float mono) {
		this.mono = mono;
	}

	public float getPoli() {
		return poli;
	}

	public void setPoli(float poli) {
		this.poli = poli;
	}

	public String toString() {
		StringBuffer stringSalida = new StringBuffer();
		stringSalida.append(codigoBarra + " - " + nombre + " - " + marca + "\n");
		stringSalida.append("Composicion \n");
	    for (Entry<String, Float> e: coeficientes.entrySet()) {
	    	stringSalida.append("\t"+e.getKey() + "=" + e.getValue()+"\n");
	    }
		stringSalida.append("Aditivos \n");
	    for(String s : aditivos)
	    	stringSalida.append("\t" + s + "\n");
		return stringSalida.toString();
	}
}













