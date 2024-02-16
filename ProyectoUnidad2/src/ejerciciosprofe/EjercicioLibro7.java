package ejerciciosprofe;

import java.util.Scanner;

public class EjercicioLibro7 {
	public static void main(String[] args) {

	int n,num,contador=1,cifra,sumaTotal=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("selecciona el numero que pasar a decimal ");
	n= sc.nextInt();
	num=n;
	while(n>=10) {
		n=n/10;
		contador++;
	}
	n=num;
	for(int i=0;i<=contador;i++) {
	cifra=(int) ((int)((int)(n/(int)(Math.pow(10,i)))%10)*Math.pow(2,i));
	sumaTotal=sumaTotal+cifra;
	}
	System.out.println(sumaTotal);

}
}
