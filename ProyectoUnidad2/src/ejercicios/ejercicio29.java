package ejercicios;

import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		a=sc.nextInt();
		if (a>9999) {
			System.out.println("el numero tiene 5 cifras");
		}
			else if(a<999) {
				System.out.println("el numero tiene 4 cifras ");
			}
			else if(a<99){
			System.out.println("el numero tiene 3 cifras");
			}
			else if(a<9){
				System.out.println("el numero tiene 2 cifras");
			}
				else{
					System.out.println("el numero tiene 1 cifras");
				}
			
		}
	}