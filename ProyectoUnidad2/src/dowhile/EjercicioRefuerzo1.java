package dowhile;
import java.util.Scanner;

public class EjercicioRefuerzo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numAlumnos=0;
		double media=0,notaAlumno=0,notaMaxima=0,notaMinima=10;
		String nombreAlumno="",alumnoMaximo="",alumnoMinimo="",curso="";
		System.out.println("Si introduces la palabra fin se acaba ");
		
		System.out.println("introduce el curso ");
		curso=sc.nextLine();
		do {
			
			System.out.println("introduce el nombre del alumno ");
			nombreAlumno=sc.next();
			
			if(!nombreAlumno.equals("fin")) {
				System.out.println("introduce la nota del alumno ");
				notaAlumno=sc.nextDouble();
				
			if(notaMaxima<=notaAlumno) {
				notaMaxima=notaAlumno;
				alumnoMaximo=nombreAlumno;
			}
			
			if(notaMinima>=notaAlumno) {
				notaMinima=notaAlumno;
				alumnoMinimo=nombreAlumno;
			}
			
			media=media+notaAlumno;
			}
			
			numAlumnos++;
			
		}while(!nombreAlumno.equals("fin"));
		
		if(numAlumnos>0) {
		media= media/numAlumnos;
		System.out.println("curso "+curso);
		System.out.println("Alumno con nota maxima: "+alumnoMaximo+":"+notaMaxima);
		System.out.println("Alumno con nota maxima: "+alumnoMinimo+":"+notaMinima);
		System.out.println("La nota media es de: "+media);
		}
		}
}