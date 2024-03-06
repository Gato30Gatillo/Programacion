package iesjandula.proyectounidad4.ejercicio51;
public class Tecnico extends Empleado {

   private String area;
   private final double porcentajeAntiguedad= 0.05;

   public Tecnico(String nombre, String apellidos, String nif, int antiguedad, int salario, String area) {
       super(nombre, apellidos, nif, antiguedad, salario);
       this.area = area;

       // TODO Auto-generated constructor stub
   }

   public String getArea() {
       return area;
   }

   public void setArea(String area) {
       this.area = area;
   }
   
   
   @Override
   public double calcularSueldo(double impuestos) {
       // TODO Auto-generated method stub
       double salarioBruto = getSalario() + (porcentajeAntiguedad *this.getAntiguedad());

       return (salarioBruto - calcularImpuestos(salarioBruto, impuestos));
   }



   @Override
   public EnumCategoria tipoEmpleado() {
       // TODO Auto-generated method stub
       return EnumCategoria.Subdirectivo;
   }


}