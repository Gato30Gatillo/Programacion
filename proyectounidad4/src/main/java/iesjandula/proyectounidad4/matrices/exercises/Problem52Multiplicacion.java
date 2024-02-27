package iesjandula.proyectounidad4.matrices.exercises;

public class Problem52Multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arrayIntA= {{1,4},{3,4}};
		int[][] arrayIntB= {{1,1},{1,1}};
		int[][] arrayIntSuma= new int[arrayIntA.length][arrayIntA.length];
		System.out.println("Recorrido por filas");

		for(int i=0;i<arrayIntA.length;i++) {
			
			for(int j=0;j<arrayIntA[i].length;j++) {
				int y=0;
				for(int z=0;z<arrayIntA[i].length;z++) {
				arrayIntSuma[i][j]=arrayIntSuma[i][j]+arrayIntA[i][y]*arrayIntB[y][z];
				y++;
				}
				System.out.format("%4d %s", arrayIntSuma[i][j],"|");
			}
			System.out.println();
		}		
	}

}
