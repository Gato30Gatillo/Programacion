package iesjandula.proyectounidad4.arraysdeobjetos.agregacion;

public class AppCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cl= new Cliente("Jesus","Soto","456231546");
		Cliente cl2= new Cliente("Pablo","Martinez","555555555");
		
		Tienda t1 = new Tienda("Software J&P","C. San Vicente Paul, 22, 23740");
		
		t1.addCliente(cl);
		t1.addCliente(cl2);
		
		t1.borrarCliente(cl2);
		
		System.out.println(t1);
	}

}
