package iesjandula.proyectounidad4.ejercicio44;

import iesjandula.proyectounidad4.ejemplosenclase.ArrayMetodos;

public class BlocNotas {
	private static final int Notas_MAX = 200;
	private Nota[] notas;

	public BlocNotas(Nota[] notas) {
		super();
		notas = new Nota[Notas_MAX];
	}	
	
	public Nota[] getNota() {
		return notas;
	}


	public void ListarNotas(Nota[] nota) {
		ArrayMetodos.mostrarArray(nota);;
	}
	public boolean agregarNota(Nota nota) {
		boolean hayHueco=false;
		for (int i=0;i<notas.length && !hayHueco;i++) {
			if(notas[i]==null) {
				hayHueco=true;
			}
			if(hayHueco) {
				notas[i]= nota;
			}
		}
		return hayHueco;
			
		}
		
		public boolean eliminarNota(String nombre) {
			boolean encontrado = false;
			for (int i = 0; i < Notas_MAX && !encontrado; i++) {
				if (notas[i].equals(nombre)) {
					encontrado = true;
					notas[i] = null;
				}
			}
			return encontrado;
		}
		
		public boolean buscarNota(String nombre) {
			boolean encontrado = false;
			for (int i = 0; i < Notas_MAX && !encontrado; i++) {
				if (notas[i].equals(nombre)) {
					encontrado = true;
				}
			}
			return encontrado;
		}
	
}
