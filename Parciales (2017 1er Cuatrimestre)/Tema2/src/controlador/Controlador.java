package controlador;

import java.util.ArrayList;
import java.util.List;

import view.AutoView;
import view.ResultadoView;

public class Controlador {

	private static Controlador instancia;
	
	private Controlador() {}
	
	public static Controlador getInstancia(){
		if(instancia == null)
			instancia = new Controlador();
		return instancia;
	}
	
	/**
	 * Devuelve a los ganadores de cada carrera (ganador es el que tiene la posicion 1
	 * 
	 * */
	public List<ResultadoView> ganadores(){
		List<ResultadoView> resultados;
		/** Ponga su c�digo ac�*/
		resultados = ResultadoDAO.getInstance().getAll();
		return resultados;
	}
	
	/**
	 * Devuelve a los autos que tienen la misma marca de motor que de chasis
	 * 
	 * */
	public List<AutoView> mismaMarca(){
		List<AutoView> resultado = new ArrayList<AutoView>();
		/** Ponga su c�digo ac�*/
		return resultado;
	}
	/**
	 * Devuelve el numero de auto, la escuderia y la posicion que tienen en el campeonato
	 * Se obtiene sumando para cada auto la cantidad de puntos obtenidas en cada carrera 
	 * en funcion de la posicion obtenida.
	 * 
	 * */
	public List<String[]> posicionesAutos(){
		List<String[]> resultado = new ArrayList<String[]>();
		/** Ponga su c�digo ac�*/
		return resultado;
	}
	/**
	 * Devuelve la escuderia y la posicion que tienen en el campeonato.
	 * Se obtiene sumando para cada escuderiala cantidad de puntos obtenidas en cada carrera 
	 * en funcion de la posicion obtenida por sus autos.
	 * 
	 * */	
	public List<String[]> posicionesEscuderias(){
		List<String[]> resultado = new ArrayList<String[]>();
		/** Ponga su c�digo ac�*/
		return resultado;
	}
}
