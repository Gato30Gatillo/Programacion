package ejercicios;

import java.util.Scanner;

public class ejercicio29b {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero entre 0 y 99999");
		a=sc.nextInt();
		if (a/10000>0) {
			System.out.println("el numero tiene 5 cifras");
		}
			else if(a/1000>0) {
				System.out.println("el numero tiene 4 cifras ");
			}
			else if(a/100>0){
			System.out.println("el numero tiene 3 cifras");
			}
			else if(a/10>0){
				System.out.println("el numero tiene 2 cifras");
			}
				else if(a>0){
					System.out.println("el numero tiene 1 cifras");
				}
				else {
					System.out.println("el numero no esta entre 0 y 99999");
				}
			
		}
	}