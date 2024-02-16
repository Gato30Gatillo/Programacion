package FundamentosOrientacionAObjetos;

public class ClasePrincipal {
	

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Coche miCoche = new SUV("Rojo", "Ford", "Mondeo", 25000, 15000);

        //Atributos PUBLICOS NO
        //miCoche.publica = "Publica";

        Coche miTesla1 = new Sedan("Rojo", "Tesla", "S",25000,15000,7);

        System.out.println(miTesla1);

        miTesla1.repintar("Verde");

        System.out.println(miCoche.numCoches);
        System.out.println(miCoche.numCoches());

        miTesla1.setMarca("Ford");
        miTesla1.setModelo("Mondeo");
        
        System.out.println("beneficios: "+ miTesla1.beneficios(0.18));
        
        
        
        Coche miTesla = new CrossOver ("rojo","Tesla","Model S High Performace",
        		50000,30000);
        
        System.out.println(miTesla);
        Coche miBMWi = new CocheDeportivo("azul"," BMW","i5",50000,40000);
        System.out.println(miBMWi);
        miBMWi.repintar("blanco");
        System.out.println("MYBMW despues de repintar " + miBMWi);
        System.out.println("color Property access via Method " +
        miBMWi.getColor());
        System.out.println("beneficio de BMW despues de venta:" +
        miBMWi.beneficios(0.10));
        System.out.println("beneficio de Tesla después de venta:" +
        miTesla.beneficios (0.10));
        
        SUV miTeslaSUV = new SUV("Azul","Tesla","Model E", 35000,30000);
        
        SUVElectrico miTeslaSUV2=new SUVElectrico("Azul","Tesla","Model E",35000,30000,75,15,4);
        
        System.out.println("Mi USV " + miTeslaSUV);
        System.out.println("Mi USV " + miTeslaSUV2);
        
        System.out.println("Autonomia " + miTeslaSUV2.autonomia());
    }

}
