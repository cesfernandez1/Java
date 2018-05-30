
public class Principal {

	public static void main(String[] args) {
		
		AlumnoFP alufp1 = new AlumnoFP("David","Guzman",22,'H',true,"DAM");
		AlumnoESO aluESO1 = new AlumnoESO("Jesus","Maria",16,'H',false,4);
		
		
		
		Profesor profe1 = new Profesor("Cesar","Fernandez",19,'H',"Tutor");
		Alumno alu1 = new Alumno("Diego","Mompo",19,'H', false);
		Pas pas1 = new Pas("Señora","Matriculas",35,'M',7);
		
		
		Persona per1 = new Persona("Pepito","Roman",29,'H');
		
		
		System.out.println(alufp1.toString());	

	}

}
