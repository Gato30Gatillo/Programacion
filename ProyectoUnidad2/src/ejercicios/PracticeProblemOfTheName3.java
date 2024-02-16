package ejercicios;
import java.util.Scanner;
public class PracticeProblemOfTheName3 {

	public static void main(String [] args) {
		double score1, score2,score3,globalscore;
		int wholeglobalscore;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce la nota del 1º trimestre");
		score1=sc.nextDouble();
		
		System.out.println("introduce la nota del 2º trimestre");
		score2=sc.nextDouble();
		
		System.out.println("introduce la nota del 3º trimestre");
		score3=sc.nextDouble();
		
		globalscore=(score3+score2+score1)/3;
		System.out.println("Su nota media en decimal es " + globalscore);
		wholeglobalscore=(int)globalscore;
		System.out.println("Su nota media entera es " + wholeglobalscore);

	}
}
