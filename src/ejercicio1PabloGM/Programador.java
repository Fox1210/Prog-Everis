package ejercicio1PabloGM;

public class Programador extends Empleado {

	// DELARACIONVDE VARIABLES
	private byte numeroContrato;
	private int numeroDeEmpleado;
	private String departamento;
	private String especialidad;

	// CONSTRUCTORES
	public Programador(String nombre, String departamento, String especialidad) {
		super(nombre);
		this.numeroContrato = Empleado.getNumeroEmpleados();
		this.numeroDeEmpleado = generadorNEmpleado();
		this.departamento = departamento;
		this.especialidad = especialidad;
	}

	// METODOS GETTERS Y SETTERS
	public byte getNumeroContrato() {
		return numeroContrato;
	}
	public int getNumeroDeEmpleado() {
		return numeroDeEmpleado;
	}

	public void setNumeroDeEmpleado(int numeroDeEmpleado) {
		this.numeroDeEmpleado = numeroDeEmpleado;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	// To String
	@Override
	public String toString() {
		return "Programador [Nombre= " + super.getNombre() + ", numeroDeEmpleado= " + numeroDeEmpleado
				+ ", departamento= " + departamento + ", especialidad= " + especialidad + "]";
	}

	// METODOS ESPECIFICOS
	private int generadorNEmpleado() {
		int numero = super.getNumeroEmpleados() + 1;
		return numero;
	}
}
