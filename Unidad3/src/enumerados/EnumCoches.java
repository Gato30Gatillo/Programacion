package enumerados;
	
public enum EnumCoches {

	ELECTRICO(1,"Motor Electrico","SEV"), 
	Diesel(2,"Motor Diesel","DV"), 
	Gas(3,"Motor Gas","GV"), 
	Hidrogeno(4,"Motor de hidrogeno","HEV");
		
		private int id;
		private String tipo;   
		private String Abre;
		   
		
		EnumCoches(int id, String tipo, String Abre) {
		       // TODO Auto-generated constructor stub
		       this.id = id;
		       this.tipo = tipo;
		       this.Abre = Abre;

		   }
		public int  getid(){
			return this.id;
		}
		public String  gettipo(){
			return this.tipo;
		}
		public String  getAbre(){
			return this.Abre;
		}
	}
	
