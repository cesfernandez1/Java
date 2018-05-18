import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		int opcion = 0;
		int num1 =0;
		int  num2 = 0;
		double base = 0;
		double exp = 0;
		int resultado = 0;
		double resultado2 = 0;
		
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
			System.out.println("7.Maximo de dos numeros");
			System.out.println("8.Minimo");
			System.out.println("9.Salir");
			
			opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1: System.out.println("Introduzca un numero");
				num1 = teclado.nextInt();
				System.out.println("Introduzca otro numero");
				num2 = teclado.nextInt();
				resultado = sumar(num1, num2);
				System.out.println(" La suma es: " +resultado);
				break;
				
			case 2: System.out.println("Introduzca un numero");
				num1 = teclado.nextInt();
				System.out.println("Introduzca otro numero");
				num2 = teclado.nextInt();
				resultado = restar(num1 , num2);
				System.out.println(" La suma es: " +resultado);
				break;
			case 3: System.out.println("Introduzca un numero");
				num1 = teclado.nextInt();
				System.out.println("Introduzca otro numero");
				num2 = teclado.nextInt();
				resultado = multi(num1, num2);
				System.out.println(" La suma es: " +resultado);
				break;
			case 4: System.out.println("Introduzca un numero");
				num1 = teclado.nextInt();
				System.out.println("Introduzca otro numero");
				num2 = teclado.nextInt();
				resultado = divid(num1, num2);
				System.out.println(" La suma es: " +resultado);
				break;
			case 5: System.out.println("Introduzca un numero");
				base = teclado.nextInt();
				System.out.println("Introduzca otro numero");
				exp = teclado.nextInt();
				resultado2 = Math.pow(base,exp);
				System.out.println(" La potencia de base " +base+ " exponente " +exp+ " es: " +resultado2);
			break;
			case 6: System.out.println("Introduzca un numero");
				base = teclado.nextInt();
				resultado2 = Math.sqrt(base);
				System.out.println(" La raiz cuadrada de " +base+ " es : " +resultado2);
				break;
			case 7: System.out.println("Introduzca un numero");
			num1 = teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num2 = teclado.nextInt();
			resultado = Math.max(num1, num2);
			System.out.println(" El maximo es: " +resultado);
			break;
			case 8: System.out.println("Introduzca un numero");
			num1 = teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num2 = teclado.nextInt();
			resultado = Math.min(num1, num2);
			System.out.println(" El minimo es : " +resultado);
			break;
			case 9: System.out.println("Saliste");
			break;
			default: System.out.println("Opcion no valida");
			}
			
		}while(opcion >= 1);

	}
	
	private static int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	private static int restar(int num1, int num2) {
		return num1 - num2;
	}
	
	private static int multi(int num1, int num2) {
		return num1 * num2;
	}
	
	private static int divid(int num1, int num2) {
		return num1 / num2;
	}

}
