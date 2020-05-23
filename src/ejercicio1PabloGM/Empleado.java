package ejercicio1PabloGM;

import java.util.Scanner;

public class Empleado {
	// DELARACIONVDE VARIABLES
	public static final String EMPRESA = "EVERIS";
	private static byte numeroEmpleados = 0;
	private int vacaciones = 21;
	private String nombre;

	// CONSTRUCTORES
	public Empleado(String nombre) {
		this.nombre = nombre;
		Empleado.setNumeroEmpleados();

	}

	// METODOS GETTERS Y SETTERS
	public static byte getNumeroEmpleados() {
		return numeroEmpleados;
	}

	private static void setNumeroEmpleados() {
		if (Empleado.numeroEmpleados < 127) {
			Empleado.numeroEmpleados++;
		} else {
			System.out.println("ERROR: Se ha alcanzado el maximo de empleados");
		}

	}

	public int getVacaciones() {
		return vacaciones;
	}

	private void setVacaciones(int vacaciones) {
		if ((0 <= vacaciones && vacaciones < 21) && vacaciones < this.getVacaciones()) {
			this.vacaciones = vacaciones;
		} else {
			if (vacaciones > this.getVacaciones()) {
				System.out.println("ERROR: Se ha modificado de forma incorecta");
			}
			if (vacaciones < 0) {
				System.out.println("ERROR: Se ha solicitado un numero de dias negativo");
			}
			if (vacaciones > 21) {
				System.out.println("ERROR: Se ha solicitado un numero de dias superior al máximo");
			}
			System.out.println("No se ha realizado la solicitud de los dias divido a un ERROR");
		}
	}

	public String getNombre() {
		return nombre;
	}

	// To String
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}

	// METODOS ESPECIFICOS
	public void vacaciones() {
		int dias;
		dias = pideDias();
		this.setVacaciones(this.getVacaciones() - dias);
	}

	private int pideDias() {
		Scanner teclado = new Scanner(System.in);
		int diasDisfrutar = 0;
		System.out.print("¿Cuantos dias de vacaciones desea cogerse? ");
		diasDisfrutar = teclado.nextInt();
		return diasDisfrutar;
	}

}// fin class Empleado
