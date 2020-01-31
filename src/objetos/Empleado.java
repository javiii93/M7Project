package objetos;

public class Empleado extends Persona {
private String cargo;
private float jornadaHoras, precioHora, sueldoMes;

public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public float getJornadaHoras() {
	return jornadaHoras;
}
public void setJornadaHoras(float jornadaHoras) {
	this.jornadaHoras = jornadaHoras;
}
public float getPrecioHora() {
	return precioHora;
}
public void setPrecioHora(float precioHora) {
	this.precioHora = precioHora;
}
public float getSueldoMes() {
	return sueldoMes;
}
public void setSueldoMes(float sueldoMes) {
	this.sueldoMes = sueldoMes;
}

}
