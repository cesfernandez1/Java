import java.util.Scanner;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] contactos = new String[6];
		
		int [] edad = {19,20,30,40,50,60};
		
		System.out.println("La edad seleccionada es : " +edad[4]);
		
		
		for(int i=0; i<edad.length; i++) {
			System.out.println(edad[i]);
		}
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<contactos.length; i++) {
			System.out.println("Introduzca un contacto en la posicion: " +i);
			contactos[i]=teclado.next();
		}
		
		for(int i=0; i<contactos.length; i++) {
			System.out.println(contactos[i]);
		}
		
		

	}

}
