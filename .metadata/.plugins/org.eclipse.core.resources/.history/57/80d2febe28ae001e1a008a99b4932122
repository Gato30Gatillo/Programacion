package funciones.enclasse;

import java.util.Scanner;

public class Funcionesmatematicas {
	
	public static String reverted(int aux) {
		String inverted="";
		
		while (aux>0) {
		inverted=inverted+(aux%10);
		aux=aux/10;
	}
		return inverted;
		
	}
	public static String delete(int aux,int eliminar) {
		String delete="";
		int cont=1;
		while (aux>0) {
			if(eliminar!=cont){
				delete=(aux%10)+delete;
			}
			aux=aux/10;
			cont++;
	}
		return delete;
		
	}
	
	public static int countdigit(int num) {
		int digitCounter=0;
		
		while(num>0) {
			digitCounter++;
			num/=10;
		}
		return digitCounter;
	}
	
	public static int deleteNDigit(int num, int N) {

		int cifra,exponente=0, contPosicion=1,numRes=0;
		
		while (num>0) {
			
			if (contPosicion!=N) {
				
				cifra=num%10;
				numRes= numRes +  cifra* (int) Math.pow(10, exponente);
				exponente++;
				
				
			} 
			contPosicion++;	
			num=num/10;
			
		}
		
		return numRes;
		
		
	}
	
	public static void main(String[] args) {
		// first i would ask for a number and create a string to get the number in inverse orden them
		//we also should create a auxiliary and them do a bucle in witch we get the last number and put it in the string
		//the bucle stop when the number only has units
		
		int num,aux=0,eliminar;
		String inverted="";
		String delete="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("give me a number");
		num= sc.nextInt();
		System.out.println("give me the position of the number you wish to delete");
		eliminar= sc.nextInt();
		aux=num; 
		inverted=reverted(aux);
		System.out.println(num+" inverted is "+inverted);
		delete=delete(aux,eliminar);
		System.out.println(num+" without the position "+eliminar+" is "+delete);
		
	}


}
