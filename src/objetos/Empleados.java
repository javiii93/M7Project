package objetos;

public class Empleados {
	
private int id;
private String DNI, cargo;
private boolean spinning, weights, culturismo, alterofilia, running, boxing, natacion;
private float horasJornada, eurosHora, sueldoMes;


public Empleados(int id, String dNI, String cargo, boolean spinning, boolean weights, boolean culturismo,
		boolean alterofilia, boolean running, boolean boxing, boolean natacion, float horasJornada, float eurosHora) {
	super();
	this.id = id;
	DNI = dNI;
	this.cargo = cargo;
	this.spinning = spinning;
	this.weights = weights;
	this.culturismo = culturismo;
	this.alterofilia = alterofilia;
	this.running = running;
	this.boxing = boxing;
	this.natacion = natacion;
	this.horasJornada = horasJornada;
	this.eurosHora = eurosHora;
	this.sueldoMes = horasJornada*4*eurosHora;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public boolean isSpinning() {
	return spinning;
}
public void setSpinning(boolean spinning) {
	this.spinning = spinning;
}
public boolean isWeights() {
	return weights;
}
public void setWeights(boolean weights) {
	this.weights = weights;
}
public boolean isCulturismo() {
	return culturismo;
}
public void setCulturismo(boolean culturismo) {
	this.culturismo = culturismo;
}
public boolean isAlterofilia() {
	return alterofilia;
}
public void setAlterofilia(boolean alterofilia) {
	this.alterofilia = alterofilia;
}
public boolean isRunning() {
	return running;
}
public void setRunning(boolean running) {
	this.running = running;
}
public boolean isBoxing() {
	return boxing;
}
public void setBoxing(boolean boxing) {
	this.boxing = boxing;
}
public float getHorasJornada() {
	return horasJornada;
}
public void setHorasJornada(float horasJornada) {
	this.horasJornada = horasJornada;
}
public float getEurosHora() {
	return eurosHora;
}
public void setEurosHora(float eurosHora) {
	this.eurosHora = eurosHora;
}
public float getSueldoMes() {
	return sueldoMes;
}
public void setSueldoMes(float sueldoMes) {
	this.sueldoMes = sueldoMes;
}
@Override
public String toString() {
	return "Empleados [id=" + id + ", DNI=" + DNI + ", cargo=" + cargo + ", spinning=" + spinning + ", weights="
			+ weights + ", culturismo=" + culturismo + ", alterofilia=" + alterofilia + ", running=" + running
			+ ", boxing=" + boxing + ", natacion=" + natacion + ", horasJornada=" + horasJornada + ", eurosHora="
			+ eurosHora + ", sueldoMes=" + sueldoMes + "]";
}


}
