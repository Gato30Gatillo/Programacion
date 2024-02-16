package fundamentos;

public class JavaConversionDeTipos {
	
	

	    public static void main(String[] args)
	    
	    
	    {
	    	
	    	byte b= (byte) 100;
	    	
	    	System.out.println(b);
	    	
	    	short s= b;
	    	
	    	
	        int i = s; 
	        
	        b= (byte) s;
	          
	        // conversión automótica 
	        long l = i; 
	          
	        // conversión automática 
	        float f = l; 
	        
	        
	        double d = b;
	        
	        System.out.println("byte  "+b);
	        System.out.println("short  "+s);
	        System.out.println("int  "+i);
	        System.out.println("long "+l);
	        System.out.println("float  "+f);
	        System.out.println("double  "+f);
	    }



}
