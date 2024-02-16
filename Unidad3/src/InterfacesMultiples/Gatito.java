package InterfacesMultiples;

public class Gatito implements Sonido, Alimento {
	@Override
	public void seAlimenta() {
// TODO Auto-generated method stub
		System.out.println("Se alimenta de pescado");
		if (this.animal || Alimento.animal)
			System.out.println("Soy un animal");
	}

	@Override
	public void produceSonido() {
// TODO Auto-generated method stub
		System.out.println("Miau Miau");
	}
}