package iesjandula.proyectounidad4.matrices.exercises;

public class Problem52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arrayIntA= {{1,2},{3,4}};
		int[][] arrayIntB= {{1,1},{1,1}};
		int[][] arrayIntSuma= new int[arrayIntA.length][arrayIntA.length];
		System.out.println("Recorrido por filas");

		for(int i=0;i<arrayIntA.length;i++) {
			
			for(int j=0;j<arrayIntA[i].length;j++) {
				arrayIntSuma[i][j]=arrayIntA[i][j]+arrayIntB[i][j];
				System.out.format("%4d %s", arrayIntSuma[i][j],"|");
			}
			System.out.println();
		}
		
		System.out.println("Recorrido por columnas");
		
		for(int i=0;i<arrayIntA[0].length;i++) {
			
			for(int j=0;j<arrayIntA.length;j++) {
				arrayIntSuma[j][i]=arrayIntA[j][i]+arrayIntB[j][i];
				System.out.format("%4d %s", arrayIntSuma[j][i],"|");
			}
			System.out.println();
		}
		
	}

}
