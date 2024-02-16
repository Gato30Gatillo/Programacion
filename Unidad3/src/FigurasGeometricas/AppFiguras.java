package FigurasGeometricas;

public class AppFiguras {

	public static void main(String[] args) {
		
		FiguraGeometrica[] arrayFiguras= new FiguraGeometrica[5];
		
		Circulo cir=new Circulo(10);
		
		Circulo cir2;
		
		FiguraGeometrica varSuper = cir;
		
		//varSuper.getradio; No se puede
		
		cir.getradio();
		
		cir=(Circulo) varSuper;
		
		FiguraGeometrica varSuperRectangulo = new Rectangulo(2,10);
		
		
		if(varSuperRectangulo instanceof Circulo)
		cir2 = (Circulo) varSuper;
		
		//da fallo
		
		if(varSuperRectangulo instanceof Circulo)
			cir2 = (Circulo) varSuperRectangulo;
		
		arrayFiguras[0] = cir;
		arrayFiguras[1]= new Cuadrado(6);
		arrayFiguras[2]= new Rectangulo(4,8);
		arrayFiguras[3]=new Cuadrado(5);
		arrayFiguras[4]= new TrianguloRectangulo(3,7);
		
		
		System.out.println(cir.calcularArea());
		
		
		for (int i=0; i< arrayFiguras.length;i++) {
			
			System.out.println("Area: "+arrayFiguras[i].calcularArea()+
					" Perimetro: "+ arrayFiguras[i].calcularPerimetro()+
					" Tipo: "+arrayFiguras[i].getTipo());
			
		}
		
		
	}
	
	
}
