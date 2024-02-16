package buclesejemplosclase;

public class WhileAnidado {
	public static void main(String args[]) {
		int i = 1;
int result = 1;

		while (i <= 3) {
			System.out.println("\n" + i + " " + "Por cada vez que se ejecuta el bucle exterior");
			System.out.println("Se ejecuta cuatro el interior");
			System.out.println("numero de entrada para calcular la potencia a la cuarta:" + i + " \n");
			int j = 1;
			result = 1;
			while (j <= 4) {

				result *= i;
				System.out.println(j + " " + "iteraci�n del bucle interno ");
				j++;
			}
			System.out.println("\nLa cuarta potencia del numero   " + i + " es " + result);

			i++;
		}
	}
}