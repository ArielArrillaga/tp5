package ejercicio6;

import java.util.ArrayList;

public class Congreso {
	private ArrayList<Evaluador>evaluadores;
	private ArrayList<Proyecto>proyectos;
	private ArrayList <String> conocimientosExperto;
	
	Congreso(){
		this.evaluadores = new ArrayList<Evaluador>();
		this.proyectos = new ArrayList<Proyecto>();
		this.conocimientosExperto = new ArrayList<String>();
	}
	
	public void addEvaluador (Evaluador e) {
		this.evaluadores.add(e);
	}
	
	public void addProyecto (Proyecto p) {
		this.proyectos.add(p);
	}
	
	public void addConocimientoExperto (String c) {
		this.conocimientosExperto.add(c);
	}
	
	
	public boolean isExperto (Evaluador e) {
		for (String tema: this.conocimientosExperto) {
			if (e.seTema(tema)) return true;
		}
		return false;
	} 
	public ArrayList <Evaluador> quienesPuedenEvaluar (Proyecto p){
		
		ArrayList <Evaluador> aux = new ArrayList <Evaluador> ();
		
		for (Evaluador e: this.evaluadores) {
			if (p.quienPuedeEvaluar(e)) {
				aux.add(e);
			}
		}
		return aux;
	}
	
	
	public  ArrayList <Proyecto> quePuedenEvaluar (Evaluador e){
		ArrayList <Proyecto> aux = new ArrayList <Proyecto> ();
		
		for (Proyecto p: this.proyectos) {
			if (e.puedoEvaluar(p)) {
				aux.add(p);
			}
		}
		
		return aux;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Congreso c1= new Congreso();
		c1.addConocimientoExperto("autos");
		c1.addConocimientoExperto("aviones");
		
		
		Evaluador e1=new Evaluador ("pedro");
		e1.addConocimiento("tenis");
		e1.addConocimiento("autos");
		
		Evaluador e2=new Evaluador ("juan");
		e2.addConocimiento("perros");
		e2.addConocimiento("papas");
		
		Evaluador e3=new Evaluador ("mauri");
		e3.addConocimiento("papas");
		e3.addConocimiento("futbol");
		e3.addConocimiento("aviones");
		
		
		c1.addEvaluador(e1);
		c1.addEvaluador(e2);
		c1.addEvaluador(e3);
		
		
		//System.out.println(c1.isExperto(e3));   //funciona
		
		
		Proyecto p1= new Proyecto ("aeroplanos");
		p1.addTema("aviones");
		p1.addTema("paracaidas");
		
		Proyecto p2= new Proyecto ("saraza");
		p2.addTema("papas");
		p2.addTema("futbol");
		
		Proyecto p3= new ProyectoPoster ("tururu");
		p3.addTema("tenis");
		p3.addTema("perros");
		
		Proyecto p4= new ProyectoPoster ("manejo");
		p4.addTema("autos");
		p4.addTema("bar");
		
		c1.addProyecto(p1);
		c1.addProyecto(p2);
		c1.addProyecto(p3);
		c1.addProyecto(p4);
		
		
	
		
		//System.out.println(e2.puedoEvaluar(p2));  //funciona
		//System.out.println(p2.quienPuedeEvaluar(e3));  //funciona
		
		/*for (int i=0; i<(c1.quePuedenEvaluar(e1)).size(); i++) {
			System.out.println(c1.quePuedenEvaluar(e1).get(i).getNombre());
		}
		
		
		for (int i=0; i<(c1.quienesPuedenEvaluar(p4)).size(); i++) {
			System.out.println(c1.quienesPuedenEvaluar(p4).get(i).getNombre());
		}
		*/
		e3.agregarProyecto(p2);
		
		System.out.println(e3.CantidadProyectosAsignados());  //funciona
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
