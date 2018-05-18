import java.util.Scanner;


public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] contactos = new String[6];
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Introduzca un contacto en la posicion" +i);
			contactos[i] = teclado.next();
			
		}
		
		System.out.println("Introduzca un contacto en la posicion: ");
		contactos[3] = teclado.next();
		
		

	}

}
