package iesjandula.proyectunidad5.Notas;

import java.util.Comparator;
import java.util.function.BiFunction;

import iesjandula.proyectunidad5.excepcionesapp.Empleado;
import iesjandula.proyectunidad5.excepcionesapp.ErrorEntradaException;
import iesjandula.proyectunidad5.excepcionesapp.ErrorIRPFException;

public class AppNotas {

	public static void main(String[] args) throws ErrorEntradaException {
		// TODO Auto-generated method stub

		Nota n1 = new NotaMarcada(0, "Conjunción", 40, "Amarillo");

		Nota n2 = new NotaAlarma(1, "Adelantar reloj", 60, "10:20");

		BlocNotas bloq = new BlocNotas();

		bloq.addNota(n1);
		bloq.addNota(n2);

		Nota n3 = bloq.buscarNotaPorId(0);

		System.out.println(n3);

		Nota[] notas = { n2, n3 };

		bloq.eliminarNota(n1);
		bloq.eliminarNota(n2);

		bloq.listarNotas();

		bloq.addNotas(notas);

		bloq.listarNotas();

		bloq.ordenarNotas(new Comparator<Nota>() {

			@Override
			public int compare(Nota o1, Nota o2) {
				// TODO Auto-generated method stub
				int res = 0;
				if (o1 == null) {

					res = -1;

				} else if (o2 == null) {

					res = 1;
				} else {
					res = o1.getId() - o2.getId();
				}

				return res;
			}

		});

		bloq.listarNotas();

		bloq.devuelvaNotasOrdenado((o1, o2) -> {
			// TODO Auto-generated method stub
			int res = 0;
			if (o1 == null) {

				res = -1;

			} else if (o2 == null) {

				res = 1;
			} else {
				res = o1.getLineaTexto().compareTo(o2.getLineaTexto());
			}

			return res;
		});

		BiFunction<Double, Integer, Double> bifu = (d, i) -> d * i;

		bifu.apply(5.0, 7);

	
	int id = -1;
	String lineatexto="";
	int numPalabraComienzo=-1;
	String hora="";
	EntradaDeDatos entradaDatos = new EntradaDeDatos();
	Nota nota = null;
	int entrada = 0;
	int alarma=0;
	String color="";

	while (alarma != 2) {
	
	System.out.println("Pulse:");
	System.out.println("0. Para introducir una nota Alarma");
	System.out.println("1. Para introducir una nota Marcada");
	System.out.println("2. Para salir");

	alarma=entradaDatos.leerEntero();
	
	while (entrada != 1 && alarma ==0) {
		System.out.println("Pulse:");
		System.out.println("0. Para introducir una nota");
		System.out.println("1. Para salir");

		entrada=entradaDatos.leerEntero();
		try {
			switch (entrada) {

			case 0:
				
				System.out.println("Introduce el id de la nota. Numero positivo");

				id = entradaDatos.leerEntero();

				System.out.println("Introduce la linea de la nota. En letra");

				lineatexto = entradaDatos.leerString();

				System.out.println("Introduce el numero de la palabra por "
						+ "la que comienza la nota. Numero positivo");

				numPalabraComienzo = entradaDatos.leerEntero();

				System.out.println("Introduce la hora de aparicion de la nota. En letra");

				hora = entradaDatos.leerString();
				
				break;

			case 1:
				System.out.println("Fin del programa");
				break;

			default:

				System.out.println("introduce un numero de menu correcto");

			}

			nota = new NotaAlarma(id, lineatexto, numPalabraComienzo,hora);
			System.out.println(nota);
			
			entradaDatos.pulsarUnaTeclaParaContinuar();

		} catch (ErrorEntradaException eee) {

			System.out.println(eee.getMessage());

		}

		finally {

			// Borramos el empleado incorrecto
			System.out.println("Procedemos a borrar la nota");

			nota = null;

		}

	}
	while (entrada != 1 && alarma ==1) {
		System.out.println("Pulse:");
		System.out.println("0. Para introducir una nota");
		System.out.println("1. Para salir");

		entrada=entradaDatos.leerEntero();
		try {
			switch (entrada) {

			case 0:
				
				System.out.println("Introduce el id de la nota. Numero positivo");

				id = entradaDatos.leerEntero();

				System.out.println("Introduce la linea de la nota. En letra");

				lineatexto = entradaDatos.leerString();

				System.out.println("Introduce el numero de la palabra por "
						+ "la que comienza la nota. Numero positivo");

				numPalabraComienzo = entradaDatos.leerEntero();

				System.out.println("Introduce el color de la nota. En letra");

				color = entradaDatos.leerString();
				
				break;

			case 1:
				System.out.println("Fin del programa");
				break;

			default:

				System.out.println("introduce un numero de menu correcto");

			}

			nota = new NotaMarcada(id, lineatexto, numPalabraComienzo,color);
			System.out.println(nota);
			
			entradaDatos.pulsarUnaTeclaParaContinuar();

		} catch (ErrorEntradaException eee) {

			System.out.println(eee.getMessage());

		}

		finally {

			// Borramos el empleado incorrecto
			System.out.println("Procedemos a borrar la nota");

			nota = null;

		}

	}

}
}
}