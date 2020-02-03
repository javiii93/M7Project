package objetos;

public class Cliente {
	private int id,idEmpleado;
	private String DNI, metodoPago;
	private boolean mesPagado;
	private float cuota;
	
	public Cliente(int id,int idEmpleado, String dNI, String metodoPago, boolean mesPagado, float cuota) {
		super();
		this.id = id;
		this.idEmpleado=idEmpleado;
		DNI = dNI;
		this.metodoPago = metodoPago;
		this.mesPagado = mesPagado;
		this.cuota = cuota;
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
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public boolean isMesPagado() {
		return mesPagado;
	}
	public void setMesPagado(boolean mesPagado) {
		this.mesPagado = mesPagado;
	}
	public float getCuota() {
		return cuota;
	}
	public void setCuota(float cuota) {
		this.cuota = cuota;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", DNI=" + DNI + ", metodoPago=" + metodoPago + ", mesPagado=" + mesPagado
				+ ", cuota=" + cuota + "]";
	}
	
}
