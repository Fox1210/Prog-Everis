package ejercicio1PabloGM;

public class Empleado {
	// DELARACIONVDE VARIABLES
	private static final String EMPRESA = "EVERIS";
	private static byte numeroEmpleados = 0;
	private static int vacaciones = 21;
	private String nombre;

	// CONSTRUCTORES
	public Empleado(String nombre) {
		this.nombre = nombre;

	}
	
	// METODOS GETTERS Y SETTERS
	public static byte getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public static void setNumeroEmpleados(byte numeroEmpleados) {
		Empleado.numeroEmpleados = numeroEmpleados;
	}

	public static int getVacaciones() {
		return vacaciones;
	}

	public static void setVacaciones(int vacaciones) {
		Empleado.vacaciones = vacaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public static String getEmpresa() {
		return EMPRESA;
	}
	
	//To String
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
	
	// METODOS ESPECIFICOS

}
