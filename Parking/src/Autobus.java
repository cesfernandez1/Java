
public class Autobus extends Automovil{
	
	String compañia;
	int numplazas;
	
	
	public Autobus(String matricula, String marca, String modelo, String compañia, int numplazas) {
		super(matricula, marca, modelo);
		this.compañia = compañia;
		this.numplazas = numplazas;
	}


	protected String getCompañia() {
		return compañia;
	}


	protected void setCompañia(String compañia) {
		this.compañia = compañia;
	}


	protected int getNumplazas() {
		return numplazas;
	}


	protected void setNumplazas(int numplazas) {
		this.numplazas = numplazas;
	}


	@Override
	public String toString() {
		return "Autobus [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", compañia=" + compañia
				+ ", numplazas=" + numplazas + "]";
	}
	
	
	
	
	

}
