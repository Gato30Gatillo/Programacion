package fundamentos;

public class StringEjemplo {
	
	
public static void main(String[] args) {

	String miString= "Puedes concatenar cualquier tipo con  Strings en Java y obtienes un String.";
	
	double media= 24.1;
	int miEdad= 35;
	final boolean STATEMENTTRUE=true;
	
	
	
	miString = miString + "\n" + "La edad media es " + media ;
	miString =  miString + "\n" + "Sin Embargo, mi edad es " + media ;
	
	miString =  miString + "\n" + "Como resultado, estoy por encima de la edad media " + true;
	
		System.out.println(miString);
		
		
	}

}
