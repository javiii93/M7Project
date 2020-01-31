package objetos;

public class Persona {
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nif;
	private String sexo;
	
	public Persona(int id, String nombre, String apellido1, String apellido2, String nif, String sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		if(nif.length()==9) {
			this.nif = nif;
		}else {
			System.out.println("NIF o NIE no reconocido. Ej NIF:00000000X, NIE:X0000000Y");
		}
		if (sexo.toUpperCase().equals("M")||sexo.toUpperCase().equals("H")) {
			this.sexo = sexo.toUpperCase();
		}else {
			System.out.println("Sexo no reconocido. Ej M (Macho), H (Hembra)");
		}
	}

	public Persona() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "id: " + id + ", Nombre: " + nombre + apellido1 + apellido2
				+ ", NIF: " + nif + ", Sexo: " + sexo;
	}
	

}
