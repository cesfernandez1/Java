import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		int opcion = 0;
		int num1 =0;
		int num2 = 0;
		int resultado = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("MENU CALCULADORA");
			System.out.println("-----------------------------");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Potencia");
			System.out.println("6.Raiz");
			System.out.println("7.Maximo");
			System.out.println("8.Minimo");
			System.out.println("9.Salir");
			
			opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1: System.out.println("Introduzca un numero");
				num1 = teclado.nextInt();
				System.out.println("Introduzca otro numero");
				num2 = teclado.nextInt();
				resultado = num1 + num2;
				System.out.println(" La suma es: " +resultado);
				break;
				
			case 2: System.out.println("La resta de 1-1 son siete");
				num1 = teclado.nextInt();
				System.out.println("Introduzca otro numero");
				num2 = teclado.nextInt();
				resultado = num1 - num2;
				System.out.println(" La suma es: " +resultado);
				break;
			case 3: System.out.println("La multiplicacion de 1*1 son siete");
				num1 = teclado.nextInt();
				System.out.println("Introduzca otro numero");
				num2 = teclado.nextInt();
				resultado = num1 * num2;
				System.out.println(" La suma es: " +resultado);
				break;
			case 4: System.out.println("La division de 1/1 son siete");
				num1 = teclado.nextInt();
				System.out.println("Introduzca otro numero");
				num2 = teclado.nextInt();
				resultado = num1 / num2;
				System.out.println(" La suma es: " +resultado);
				break;
			case 5: System.out.println("La potencia de 1^1 son siete");
			break;
			case 6: System.out.println("La raiz de 1 son siete");
			break;
			case 7: System.out.println("El maximo  de 1+1 son siete");
			break;
			case 8: System.out.println("El minimo de 1+1 son siete");
			break;
			case 9: System.out.println("La suma de 1+1 son siete");
			break;
			default: System.out.println("Opcion no valida");
			}
			
		}while(opcion >= 1);

	}

}
