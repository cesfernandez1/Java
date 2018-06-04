
public class Automovil {
	
		protected String matricula;
		protected String marca;
		protected String modelo;

public Automovil (String matricula, String marca, String modelo) {
	this.matricula = matricula;
	this.marca = marca;
	this.modelo = modelo;
}

protected String getMatricula() {
	return matricula;
}

protected void setMatricula(String matricula) {
	this.matricula = matricula;
}

protected String getMarca() {
	return marca;
}

protected void setMarca(String marca) {
	this.marca = marca;
}

protected String getModelo() {
	return modelo;
}

protected void setModelo(String modelo) {
	this.modelo = modelo;
}

@Override
public String toString() {
	return "Automovil [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
}	


}
