package ejercicios.ejercicio44Ingles;

import java.util.Comparator;

public class ComparatorForEmployeeById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {

		
		return o1.getId()>o2.getId()?1:(o1.getId()==o2.getId()?0:-1);
	}

}
