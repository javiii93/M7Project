package objetos;

public class Cliente extends Persona {
private float cuotaMensual;
private boolean mesPagado;
public float getCuotaMensual() {
	return cuotaMensual;
}
public void setCuotaMensual(float cuotaMensual) {
	this.cuotaMensual = cuotaMensual;
}
public boolean isMesPagado() {
	return mesPagado;
}
public void setMesPagado(boolean mesPagado) {
	this.mesPagado = mesPagado;
}
@Override
public String toString() {
	return "Cliente [cuotaMensual=" + cuotaMensual + ", mesPagado=" + mesPagado + "]";
}

	
	
}
