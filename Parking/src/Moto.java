
public class Moto extends Automovil{
	
	int cilindrada;

	public Moto(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	protected int getCilindrada() {
		return cilindrada;
	}

	protected void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ "]";
	}
	
	

}
