
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 7;
		double cifra = 9.5;
		String palabra = "cesar";
		char caracter = 'a';
		boolean soyHumano = true;
		
		System.out.println(numero);
		System.out.println(palabra);
		
		
		if(numero > 0) {
			System.out.println("El numero es mayor que 0");
		}else {
			if(numero == 0) {
				System.out.println("El numero es igual que 0");
			}else {
				System.out.println("El numero es menor que 0");
			}
		}

	}

}
