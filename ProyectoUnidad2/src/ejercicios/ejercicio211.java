package ejercicios;

import java.util.Scanner;

public class ejercicio211 {

	public static void main(String[] args) {
		int a;
		boolean b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero entre 0 y 99999");
		a=sc.nextInt();
		if (a/100000>0) {
			System.out.println("el numero no esta entre 0 y 99999");
		}
		else if (a/10000>0) {
			b=a/10000==a%10&&(a/1000)%10==(a/10)%10;
			System.out.println("es capicua "+b);
		}
			else if(a/1000>0) {
				b=a/1000==a%10&&(a/10)%10==(a/100)%10;
				System.out.println("es capicua "+b);
			}
			else if(a/100>0){
				b=a/100==a%10;
			System.out.println("es capicua "+b);
			}
			else if(a/10>0){
				b=a/10==a%10;
				System.out.println("es capicua "+b);
			}
				else if(a>0){
					System.out.println("es capicua");
				}
				else {
					System.out.println("el numero no esta entre 0 y 99999");
				}
			
		}
	}