package ejercicios.ejercicio9;

public class AppAtleta {

	public static void main(String[] args) {

		
		Atleta at1 = new Atleta("Alejandro Perlaza",9.55);
		Atleta at2 = new Atleta("Anthony Zambrano",9.28);
		Atleta at3 = new Atleta("Diego Palomeque",9.53);
		Atleta at4 = new Atleta("Gilmar Herrera",9.29);
		
		System.out.println(at1);
		System.out.println(at2);
		System.out.println(at3);
		System.out.println(at4);
		
		Atleta.correr400Metros(at1.Tiempo,at2.Tiempo,at3.Tiempo,at4.Tiempo);
	}

}
