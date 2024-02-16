package sentencesswitch;

	import java.util.Scanner;

	  

public class EjemploSwitchConEnum {
	  
	    // Driver method
	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);

	    	enum Mes {
	    	    ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO,
	    	    JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
	    	}
	    	    Mes mes= Mes.ENERO;
	    	    
	    	    System.out.println("Enero es: "+ mes.ordinal());
	    	  
	    	    Mes mes2= mes.valueOf("Enero");
	    	    
	    	    System.out.println("Febrero es: "+ mes2.ordinal());
	    	
	    	        switch (mes)
	    	        {
	    	        case DICIEMBRE,ENERO,FEBRERO:
	    	            System.out.println("Frio, a veces lluvioso a veces nevado.");
	    	            break;
	    	        case MARZO, ABRIL, MAYO:
	    	            System.out.println("La primavera ha llegado, mejor tiempo.");
	    	            break;
	    	        case JUNIO, JULIO, AGOSTO:
	    	        	
	    	        	System.out.println("Tiempo de verano, vacaciones para disfrutar de un tiempo humedo y caluroso.");
	                break;
	    	        case SEPTIEMBRE, OCTUBRE, NOVIEMBRE:
	    	            System.out.println("Buen tiempo para actividades f�sicas hasta noviembre.");
	    	            break;
	    	        default:
	    	            System.out.println("Te has olvidado algún mes?");
	    	            break;
	    	        }
	    	    }
	    	    
	   	    }
	
