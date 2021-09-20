package ejercicio6;

public class ProyectoPoster extends Proyecto {
	
	
	public ProyectoPoster(String nombre) {
		super(nombre);
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
		_*/
		//parte 2
		
		public boolean quienPuedeEvaluar(Evaluador e) {
			for (String pClave: palabrasClave) {
				if (e.seTema(pClave)) {
					return true;
				}
				
			}
			return false;
			
		}
}
