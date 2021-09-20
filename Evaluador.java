package ejercicio6;

import java.util.ArrayList;

public class Evaluador {
	private String nombre;
	private ArrayList<String> conocimientos;
	private ArrayList<Proyecto> proyectosAsignados;
	
	public Evaluador(String nombre) {
		this.nombre = nombre;
		this.conocimientos =new ArrayList<String>();
		this.proyectosAsignados =new ArrayList<Proyecto>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addConocimiento(String c) {
		this.conocimientos.add(c);
	}
	private void addProyectosAsignados(Proyecto c) {
		this.proyectosAsignados.add(c);
	}
	
	public void agregarProyecto (Proyecto p) {
		if (puedoEvaluar(p)&&!p.isTieneEvaluador()) {
			this.addProyectosAsignados(p);
			p.setTieneEvaluador(true);
		}
	}
	
	//parte 1
	
	/*public boolean puedoEvaluar (Proyecto p) {       //conocimiento (a,b,c)----> temas (a, c)    me devolveria que no puede evaluarlo,  si puede. tengo que revisar a la inversa.
		for (String conocimiento: conocimientos) {
			if (!p.puedeEvaluarme(conocimiento)) {
				return false;
			}
		}
		return true;
	}
	
	//parte 2
	*/

	public boolean seTema(String tema) {
		for (String conocimiento : conocimientos) {
			if (conocimiento.equals(tema)) {
				return true;
			}
			
		}
		return false;
	}
	
	public boolean puedoEvaluar(Proyecto p) {
		return p.quienPuedeEvaluar(this);
	}
	
	
	//parte 3
	
	public int CantidadProyectosAsignados() {
		return this.proyectosAsignados.size();
	}
	
	
}
