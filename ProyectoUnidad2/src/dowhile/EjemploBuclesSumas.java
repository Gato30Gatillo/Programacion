package dowhile;
import java.util.Scanner;

public class EjemploBuclesSumas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum=0,num=0,max,min;
		
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		//con esto el maximo sera el minimo valor posible y el minimo sera el maximo valor posible
		//por lo cual seran rapidamente sustituidos
		System.out.println("si introduces el numero 0 se acabara ");
		//no ponemos el otro por que no es neceseraio al usar el do while 
		//ya que este siempre se hara al menos una vez
		do {
			System.out.println("introduce un numero distinto de 0 ");
			num=sc.nextInt();
			sum=sum+num;

			if(max<num&&num!=0) {
				max=num;
			}
			if(min>num&&num!=0) {//asi el 0 no sera el minimo
				min=num;
			}
		}while(num!=0);
		System.out.println("la suma de total es de "+sum);
		System.out.println("el maximo es "+max);
		System.out.println("el minimo es "+min);

	}

}
