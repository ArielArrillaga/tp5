package ejercicio6;

import java.util.ArrayList;

public class Proyecto {
	private String nombre;
	protected ArrayList<String> palabrasClave;
	private boolean tieneEvaluador; 

	public Proyecto(String nombre) {
		this.nombre = nombre;
		this.palabrasClave =new ArrayList<String>();
		this.tieneEvaluador=false;
	}
	public boolean isTieneEvaluador() {
		return tieneEvaluador;
	}
	public void setTieneEvaluador(boolean tieneEvaluador) {
		this.tieneEvaluador = tieneEvaluador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addTema(String c) {
		this.palabrasClave.add(c);
	}
	
	//parte 1
	/*
	public boolean puedeEvaluarme (String conocimiento) {
		for (String pClave : palabrasClave) {
			if (pClave.equals(conocimiento)) {
				return true;
			}
			
		}
		return false;
	}
	
	//parte 2
	*/
	
	public boolean quienPuedeEvaluar(Evaluador e) { 
		for (String pClave: palabrasClave) {
			if (!e.seTema(pClave)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
}
