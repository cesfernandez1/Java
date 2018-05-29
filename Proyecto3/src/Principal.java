
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int filas = 10;
		int columnas = 10;
		
		int [][] matriz = new int [filas][columnas];
		
		inicializarMatriz(matriz, filas, columnas);
		
			  
		}


	private static void inicializarMatriz(int[][] matriz, int filas, int columnas) {
		
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				matriz[i][j] = 0;
	}
		// TODO Auto-generated method stub
		
		}
	}

}
