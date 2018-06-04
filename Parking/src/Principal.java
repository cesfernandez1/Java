import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		String matricula = null;
		String marca = null;
		String modelo = null;
		int dni = 0;
		boolean electrica = true;
		int columnas = 10;
		int filas = 5;
		int opcion;
		int fila , columna;
		char[][] parking = new char[filas][columnas];
		
		
		Scanner teclado = new Scanner(System.in);
		inicializarParking(parking, filas, columnas);
		
		do {
			System.out.println("1- Ver Parking");
			System.out.println("2- Entrada coche");
			System.out.println("3- Entrada moto");
			System.out.println("4- Entrada autobus");
			System.out.println("5- Salida vehiculo");
			System.out.println("6- Ver ganancias");
			System.out.println("7- Salir");
			System.out.println("Introduce una opcion ");
			opcion = teclado.nextInt();
			
		}while(opcion != 7);
		
		
		
		
	}
	
	private static void imprimirParking(char[][]parking, int filas,int columnas) {
		for(int f=0; f<filas;f++) {
			for(int c=0;c<columnas;c++) {
				System.out.print(parking[f][c]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void inicializarParking(char[][] parking,int filas, int columnas) {
		for(int f=0;f<filas;f++) {
			for(int c=0; c<columnas; c++){
				parking[f][c] = '\0';
				if((f == 0 && c == 0) || (f == 0 && c == 9) || (f == 4 && c == 0) || (f == 4 && c == 9) || (f == 2 && c == 9 ))
					parking[f][c]= 'X';
				if((f == 0 && c >=1 && c<9) || (f == 4 && c>= 1 && c<9) || (f >= 1 && f < 4 && c == 9))
					parking[f][c] = 'P';
				if(f == 1 && c == 0)
					parking[f][c] = 'E';
				if(f == 3 && c == 0)
					parking[f][c] = 'S';
		}
	}

}
}
