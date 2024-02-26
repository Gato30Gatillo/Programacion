package iesjandula.proyectounidad4.matrices.exercises;

public class Problem49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arrayInt= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Recorrido por filas");

		for(int i=0;i<arrayInt.length;i++) {
			
			for(int j=0;j<arrayInt[i].length;j++) {
				System.out.format("%4d %s", arrayInt[i][j],"|");
				System.out.print(arrayInt[i][j]+"|");
				System.out.flush();
			}
			System.out.println();
			System.out.flush();
		}
		
		System.out.println("Recorrido por columnas");
		//Recorrrido por columnas
				for(int i=0;i<arrayInt[0].length;i++) {
			
			for(int j=0;j<arrayInt.length;j++) {
				System.out.format("%4d %s", arrayInt[j][i],"|");
				System.out.print(arrayInt[j][i]+"|");
				System.out.flush();
			}
			System.out.println();
			System.out.flush();
		}
		
	}

}
