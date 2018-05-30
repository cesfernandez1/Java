
public class Pas extends Persona{
	int numHoras;

	public Pas(String nombre, String apellidos, int edad, char sexo, int numHoras) {
		super(nombre, apellidos, edad, sexo);
		this.numHoras = numHoras;
	}

	protected int getNumHoras() {
		return numHoras;
	}

	protected void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	@Override
	public String toString() {
		return "Pas [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo
				+ ", numHoras=" + numHoras + "]";
	}
	
	

}
