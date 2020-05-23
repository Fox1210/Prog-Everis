package ejercicio1PabloGM;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testProgramador();
		testEmpleado();

	}// fin main

	private static void testProgramador() {
		System.out.println(Empleado.getNumeroEmpleados());
		Programador pablo = new Programador("Pablo", "producion", "java");
		System.out.println(Empleado.getNumeroEmpleados());
	}//fin test programador

	private static void testEmpleado() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");// inicio o fin
		// test Empresa
		System.out.println(Empleado.EMPRESA);
		System.out.println("*****************************************************************");// Separador
		// test vacaciones
		Empleado paco = new Empleado("Paco");
		System.out.println(paco.getVacaciones());
		paco.vacaciones();
		System.out.println(paco.getVacaciones());
		paco.vacaciones();
		System.out.println(paco.getVacaciones());
		System.out.println("*****************************************************************");// Separador
		// test numero de empleados
		System.out.println(Empleado.getNumeroEmpleados());
		// se debe dar dos error y finalizar en 127
		for (int i = 0; i < 128; i++) {
			Empleado alvaro = new Empleado("Paco");
			System.out.println(Empleado.getNumeroEmpleados());
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");// inicio o fin
	}//fon test empleado

}// fin class fpdual
