package enumerados;

public enum EnumeradoComplejoEstudiante {

   EXCHANGE_STUDENT("EXCHANGE STUDENT", 1, "INTERNATIONAL"), NATIONAL_STUDENT("NATIONAL STUDENT", 2, "NATIONAL"),
   STATE_STUDENT("STATE STUDENT", 3, "LOCAL");

   private String description;
   private int id;
   private String nameStudent;

   EnumeradoComplejoEstudiante(String description, int id, String nameStudent) {
       // TODO Auto-generated constructor stub
       this.description = description;
       this.id = id;
       this.nameStudent = nameStudent;

   }

   public String getDescription() {

       return this.description;
   }

   public int getId() {
       return id;
   }

   public String getNameStudent() {
       return nameStudent;
   }

}