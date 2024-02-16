package ejemplosclase;
import java.util.Scanner;

import java.util.Random;

public class Ejercicio217 {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int resultado,intento;
			String signo;
			Random rand=new Random();
			int ran1=rand.nextInt(1,99);
			int ran2=rand.nextInt(1,99);
			int operacion=rand.nextInt(1,3);

			switch (operacion) {
			case 1-> 
			signo="+";
			case 2->
			signo="-";
			case 3->
			signo="*";
			default->
			signo="";
			
			}
		System.out.println("cuanto es "+ran1+signo+ran2);
		intento=sc.nextInt();
		switch (operacion) {
		case 1-> {
		resultado=ran1+ran2;
		if(resultado==intento) {
			System.out.println("hacertaste eres increible");

		}
		else {
			System.out.println("fallaste inutil");

		}
		}
		case 2->{
		resultado=ran1-ran2;
		if(resultado==intento) {
			System.out.println("hacertaste eres increible");

		}
		else {
			System.out.println("fallaste inutil");

		}
		}
		case 3->{
		resultado=ran1*ran2;
		if(resultado==intento) {
			System.out.println("hacertaste eres increible");

		}
		else {
			System.out.println("fallaste inutil");

		}
		}
		default->{
		resultado=ran1+ran2;
		if(resultado==intento) {
			System.out.println("hacertaste eres increible");

		}
		else {
			System.out.println("fallaste inutil");

		}
		resultado=ran1+ran2;
		if(resultado==intento) {
			System.out.println("hacertaste eres increible");

		}
		else {
			System.out.println("fallaste inutil");

		}
		}
		}
		}
}