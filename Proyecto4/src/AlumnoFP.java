
public class AlumnoFP extends Alumno {
	
	String ciclo;

	public AlumnoFP(String nombre, String apellidos, int edad, char sexo, boolean becado, String ciclo) {
		super(nombre, apellidos, edad, sexo, becado);
		this.ciclo = ciclo;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	@Override
	public String toString() {
		return "AlumnoFP [becado=" + becado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", sexo=" + sexo + ", ciclo=" + ciclo + "]";
	}
	
	
	
	

}
