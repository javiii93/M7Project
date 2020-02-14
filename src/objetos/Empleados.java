package objetos;

import javafx.scene.control.CheckBox;

public class Empleados {

	private int id2;
	private String nombre, DNI, cargo;
	private CheckBox spinning, weights, culturismo, alterofilia, running, boxing, natacion;
	private float horasJornada, eurosHora, sueldoMes;

	public Empleados(int id2, String nombre, String dNI, String cargo, float horasJornada, float eurosHora) {
		super();
		this.id2 = id2;
		this.nombre = nombre;
		DNI = dNI;
		this.cargo = cargo;
		this.spinning = new CheckBox();
		this.weights = new CheckBox();
		this.culturismo = new CheckBox();
		this.alterofilia = new CheckBox();
		this.running = new CheckBox();
		this.boxing = new CheckBox();
		this.natacion = new CheckBox();
		this.horasJornada = horasJornada;
		this.eurosHora = eurosHora;
		this.sueldoMes = horasJornada * eurosHora;
		;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public CheckBox getSpinning() {
		return spinning;
	}

	public void setSpinning(CheckBox spinning) {
		this.spinning = spinning;
	}

	public CheckBox getWeights() {
		return weights;
	}

	public void setWeights(CheckBox weights) {
		this.weights = weights;
	}

	public CheckBox getCulturismo() {
		return culturismo;
	}

	public void setCulturismo(CheckBox culturismo) {
		this.culturismo = culturismo;
	}

	public CheckBox getAlterofilia() {
		return alterofilia;
	}

	public void setAlterofilia(CheckBox alterofilia) {
		this.alterofilia = alterofilia;
	}

	public CheckBox getRunning() {
		return running;
	}

	public void setRunning(CheckBox running) {
		this.running = running;
	}

	public CheckBox getBoxing() {
		return boxing;
	}

	public void setBoxing(CheckBox boxing) {
		this.boxing = boxing;
	}

	public CheckBox getNatacion() {
		return natacion;
	}

	public void setNatacion(CheckBox natacion) {
		this.natacion = natacion;
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

}
