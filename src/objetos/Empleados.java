package objetos;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Empleados {

	private SimpleIntegerProperty id2;
	private SimpleStringProperty nombre, DNI, cargo;
	private SimpleBooleanProperty spinning, weights, culturismo, alterofilia, running, boxing, natacion;
	private SimpleFloatProperty horasJornada, eurosHora, sueldoMes;

	public Empleados(int id, String nombre, String dNI, String cargo, boolean spinning, boolean weights,
			boolean culturismo, boolean alterofilia, boolean running, boolean boxing, boolean natacion,
			float horasJornada, float eurosHora) {
		super();
		this.id2 = new SimpleIntegerProperty(id);
		this.nombre = new SimpleStringProperty(nombre);
		DNI = new SimpleStringProperty(dNI);;
		this.cargo = new SimpleStringProperty(cargo);
		this.spinning = new SimpleBooleanProperty(spinning);
		this.weights = new SimpleBooleanProperty(weights);
		this.culturismo = new SimpleBooleanProperty(culturismo);
		this.alterofilia = new SimpleBooleanProperty(alterofilia);
		this.running = new SimpleBooleanProperty(running);
		this.boxing = new SimpleBooleanProperty(boxing);
		this.natacion =new SimpleBooleanProperty(natacion) ;
		this.horasJornada = new SimpleFloatProperty(horasJornada);
		this.eurosHora = new SimpleFloatProperty(eurosHora);
	}

	public SimpleIntegerProperty getId2() {
		return id2;
	}

	public void setId2(SimpleIntegerProperty id2) {
		this.id2 = id2;
	}

	public SimpleStringProperty getNombre() {
		return nombre;
	}

	public void setNombre(SimpleStringProperty nombre) {
		this.nombre = nombre;
	}

	public SimpleStringProperty getDNI() {
		return DNI;
	}

	public void setDNI(SimpleStringProperty dNI) {
		DNI = dNI;
	}

	public SimpleStringProperty getCargo() {
		return cargo;
	}

	public void setCargo(SimpleStringProperty cargo) {
		this.cargo = cargo;
	}

	public SimpleBooleanProperty getSpinning() {
		return spinning;
	}

	public void setSpinning(SimpleBooleanProperty spinning) {
		this.spinning = spinning;
	}

	public SimpleBooleanProperty getWeights() {
		return weights;
	}

	public void setWeights(SimpleBooleanProperty weights) {
		this.weights = weights;
	}

	public SimpleBooleanProperty getCulturismo() {
		return culturismo;
	}

	public void setCulturismo(SimpleBooleanProperty culturismo) {
		this.culturismo = culturismo;
	}

	public SimpleBooleanProperty getAlterofilia() {
		return alterofilia;
	}

	public void setAlterofilia(SimpleBooleanProperty alterofilia) {
		this.alterofilia = alterofilia;
	}

	public SimpleBooleanProperty getRunning() {
		return running;
	}

	public void setRunning(SimpleBooleanProperty running) {
		this.running = running;
	}

	public SimpleBooleanProperty getBoxing() {
		return boxing;
	}

	public void setBoxing(SimpleBooleanProperty boxing) {
		this.boxing = boxing;
	}

	public SimpleBooleanProperty getNatacion() {
		return natacion;
	}

	public void setNatacion(SimpleBooleanProperty natacion) {
		this.natacion = natacion;
	}

	public SimpleFloatProperty getHorasJornada() {
		return horasJornada;
	}

	public void setHorasJornada(SimpleFloatProperty horasJornada) {
		this.horasJornada = horasJornada;
	}

	public SimpleFloatProperty getEurosHora() {
		return eurosHora;
	}

	public void setEurosHora(SimpleFloatProperty eurosHora) {
		this.eurosHora = eurosHora;
	}

	public SimpleFloatProperty getSueldoMes() {
		return sueldoMes;
	}

	public void setSueldoMes(SimpleFloatProperty sueldoMes) {
		this.sueldoMes = sueldoMes;
	}



}
