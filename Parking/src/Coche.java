
public class Coche extends Automovil{
	
	int dni;
	boolean electrico;
	public Coche(String matricula, String marca, String modelo, int dni, boolean electrico) {
		super(matricula, marca, modelo);
		this.dni = dni;
		this.electrico = electrico;
	}
	protected int getDni() {
		return dni;
	}
	protected void setDni(int dni) {
		this.dni = dni;
	}
	protected boolean isElectrico() {
		return electrico;
	}
	protected void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", dni=" + dni
				+ ", electrico=" + electrico + "]";
	}
	
	

}
