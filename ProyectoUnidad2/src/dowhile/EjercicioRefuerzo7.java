package dowhile;
import java.util.Scanner;
		
public class EjercicioRefuerzo7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num=0,i=1,resultado=0;
		System.out.println("introduce un numero");
		num=sc.nextInt();
		System.out.println("La tabla del "+num+"es");
		while(i<=10){
			resultado = num*i;
			System.out.println(num+"*"+i+"="+resultado);
			i++;
		}
		
}
}	