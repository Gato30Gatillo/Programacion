package iesjandula.proyectunidad5.excepciones;

public class ExcepcionRuntime {
    public static void main(String[] args) {
        try {
    	muestraArray();
    }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Error;;;;;;;;"+e.getMessage());
        	
        	e.printStackTrace();
        }
        finally {
        	System.out.println("Finally siempre se ejecuta");
        }
    }

    private static void muestraArray() {
// TODO Auto-generated method stub
        int[] array = { 4, 2, 6 };
        for (int i = 0; i <= 3; i++) {
            System.out.println(array[i]);
        }
    }
}