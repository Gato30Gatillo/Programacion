package fundamentos;

public class ConversionTiposPerdida {
	
	public static void main(String args[]) 
    { 
        byte b; 
        int i = 257; 
        double d = 323.142;
        System.out.println("Conversion de int a byte."); 
        
       
        
        //i%256
        b = (byte) i; 
        System.out.println("i = " + i + " b = " + b);
        System.out.println("\nConversion de double a byte.");
          
        
        
        //d%256
        b = (byte) d; 
        System.out.println("\nDe double a byte d = " + d + " b= " + b);
    }


}
