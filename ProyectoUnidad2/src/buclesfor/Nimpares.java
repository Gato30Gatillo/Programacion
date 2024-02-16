package buclesfor;
import java.util.Scanner;

public class Nimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;//we create a variable to know how many odd number we have to show
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el numero de impares que hay que mostrar ");
		n=sc.nextInt();// we ask the user for a number of odd we have to show
		
		for (int i=1;i<=n*2-1;i++) {// since every two numbers we have an odd number
			//we ask the program to look number by number if they are odd numbers
			//and the program do it until it reach 2*n-1
			//since 
									
			if (i%2==1&&i+2<=n*2-1) {//if i/2 have 1 as rest the number is odd 
				//so we print it and if i+2 is under or equal as n*2+1 we put a , after it
				System.out.print(i+",");
			}
			else if (i%2==1&&i+2>n*2-1) {// if i+2 is over n*2+1 we don't put the ,
				System.out.print(i);
			}
		
			
		}
	}

}
