package iesjandula.proyectounidad4.varargs;

import java.util.function.Function;

public class EjemploVarArgs {
// metodo que toma un numero variable de parametros
	static void fun(int... a) {
		System.out.println("Numero de parametros " + a.length);
// for each
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
// recorrido con for y notacion de array
		for (int i = 0; i < a.length; i++) {
			a[i]++;
		}
	}

// Metodo que toma un array como parametro.
	static void fun3(int[] a) {
	}

	static double media(int ... num) {
		double media=0;
		for (int i : num) {
			media+= num[i];
		}
		media = media/num.length;
		return media;
	}
	static boolean estaEnLista(int num, int...lista) {
		boolean encontrado=false;
		for(int i=0;i<lista.length && !encontrado; i++) {
			if (num==lista[i]) {
				encontrado= true;
			}
		}
		return encontrado;
	}
	
	static double tratarNumerosConLanda(Function<Integer,Double>miFunc,int ...listanum) {
		
		double suma=0;
		
		for(int num: listanum) {
			System.out.println(num);
			System.out.println(miFunc.apply(num));
			suma= miFunc.apply(num);
		}
		
		return suma;
	}
	
// metodo main
	public static void main(String args[]) {
		int[] arrayNum = { 1, 3, 4, 6, 7 };
// llamamos con un numero diferente de parametros a fun
// 1 parametro
		fun(100);
// 4 parametros
		fun(1, 2, 3, 4);
// esta llamada fallaria en compilacion
// fun3(1, 2, 3, 4);
// sin parametros
		fun();
		fun3(arrayNum);
		fun(arrayNum);
		fun(arrayNum);
		
		
		
		tratarNumerosConLanda((num)->Math.sqrt(num),3,6,7,8);
		tratarNumerosConLanda((num)->Math.pow(num,2),3,6,7,8);
	}
}
