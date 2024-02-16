package ejerciciosprofe;

import java.util.Scanner;

public class ejercio5Ingles {
	public static void main(String[] args) {
		int n,cubo;
		Scanner sc = new Scanner(System.in);
		System.out.println("selecciona el numero hasta el que quiere el cubo  ");
		n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			cubo=(int) (Math.pow(i,3));
			System.out.println("el cubo de "+i+" es "+cubo  );
		}
	}

}
