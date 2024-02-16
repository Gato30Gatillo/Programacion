package buclesfor;
import java.util.Scanner;

public class Npares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;//we create a variable to know how many pair number we have to show
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el numero de pares que hay que mostrar ");
		n=sc.nextInt();// we ask the user for a number of pair we have to show
		
		for (int i=0;i<=2*(n-1);i++) {// since every two numbers we have a pair number
			//we ask the program to look number by number if they are pair numbers
			//and the program do it until it reach 2*(n-1) 
			//since 
	
			if (i%2==0&&i+2<=2*(n-1)) {//if i/2 have 0 as rest the number is pair 
				//so we print it and if i+2 is under or equal as 2*(n+1) we put a , after it
				
				System.out.print(i+",");
			}
			else if (i%2==0&&i+2>2*(n-1)) {// if i+2 is over 2*(n+1) we don't put the ,
				System.out.print(i);
			}
		
			
		}
	}

}
