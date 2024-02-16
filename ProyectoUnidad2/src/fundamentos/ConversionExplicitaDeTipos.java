package fundamentos;

public class ConversionExplicitaDeTipos {
	
	public static void main(String[] args)
    {
        double d = 100.04; 
          
        //casteo explicito 
        long l = (long)d;
        
        //casteo explicito 
        int i = (int)l; 
        System.out.println("double  "+d);
          
        //perdida parcial de datos
        System.out.println("long  "+l); 
          
        //perdida parcial de datos
        System.out.println("int  "+i); 
    } 

}
