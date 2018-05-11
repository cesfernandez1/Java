
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String alumno = "fernandez";
		
		
		for (int i = 0; i<alumno.length(); i++) {
			//Con charAt obtengo la letra del String en cada iteracion
			char letra = alumno.charAt(i);
			System.out.print(letra);
		}
	}

}
