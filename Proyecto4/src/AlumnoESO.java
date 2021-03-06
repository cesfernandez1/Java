
public class AlumnoESO extends Alumno {
	
	int curso;

	public AlumnoESO(String nombre, String apellidos, int edad, char sexo, boolean becado, int curso) {
		super(nombre, apellidos, edad, sexo, becado);
		this.curso = curso;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "AlumnoESO [becado=" + becado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", sexo=" + sexo + ", curso=" + curso + "]";
	}



}
