
public class Coche {
	String matricula;
	String marca;
	String modelo;
	int año;
	String color;
	double precio;
	char motor; // D = DIesel ; G = Gasolina ; H = Hibrido
	boolean itv;
	
	
	public Coche(String matricula, String marca, String modelo, int año, String color, double precio, char motor,
			boolean itv) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
		this.precio = precio;
		this.motor = motor;
		this.itv = itv;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public char getMotor() {
		return motor;
	}


	public void setMotor(char motor) {
		this.motor = motor;
	}


	public boolean isItv() {
		return itv;
	}


	public void setItv(boolean itv) {
		this.itv = itv;
	}


	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color="
				+ color + ", precio=" + precio + ", motor=" + motor + ", itv=" + itv + "]";
	}
	
	
	
	
}
