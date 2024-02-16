package fundamentos;

public class EjemploBooleanos {
	
	public static void main(String[] argv)
	  {
	   boolean javaesdivertido= true;
	   boolean aprogramar=true;
	   boolean errores=false;
	   boolean comentarios=false;
	   
	   
	   System.out.println(javaesdivertido&&aprogramar);
	    
	   System.out.println(javaesdivertido&&errores);
	   
	   System.out.println(errores&&comentarios);
	   
	   
	   System.out.println(javaesdivertido||aprogramar);
	    
	   System.out.println(javaesdivertido||errores);
	   
	   System.out.println(errores||comentarios);
	   
	   System.out.println(!javaesdivertido);
	   
	   System.out.println(!comentarios);
	   
	   
	  }
	

}
