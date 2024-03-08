package iesjandula.proyectounidad4.claseArray;
import java.util.Comparator;

public class ComparatorEmpleadoId implements Comparator<Empleado>{

	@Override
	public int compare(Empleado o1, Empleado o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

}
