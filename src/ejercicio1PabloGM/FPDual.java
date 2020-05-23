package ejercicio1PabloGM;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//testProgramador();
		//testEmpleado();
		practicaVariables();

	}// fin main

	private static void practicaVariables() {
		Programador pablo1 = new Programador("Pablo", "producion", "java");
		Programador pablo2 = new Programador("Pablo", "producion", "java");
		Programador pablo3 = new Programador("Pablo", "producion", "java");
		Programador pablo4 = new Programador("Pablo", "producion", "java");
		System.out.println("*****************************************************************");// Separador
		System.out.println("Primer empleado contratado: "+pablo1.getNumeroContrato());
		System.out.println("Cuarto empleado contratado: "+pablo4.getNumeroContrato());
		System.out.println("*****************************************************************");// Separador
		System.out.println("Numero del primer empleado: "+pablo1.getNumeroDeEmpleado());
		System.out.println("Numero del segundo empleado: "+pablo2.getNumeroDeEmpleado());
		System.out.println("Numero del tercero empleado: "+pablo3.getNumeroDeEmpleado());
		System.out.println("Numero del cuarto empleado: "+pablo4.getNumeroDeEmpleado());
		System.out.println("*****************************************************************");// Separador
		System.out.println("Número de dias de vacaciones del segundo empleado: "+pablo2.getVacaciones());
		pablo2.vacaciones();
		System.out.println("Número de dias de vacaciones del segundo empleado: "+pablo2.getVacaciones());
		System.out.println("*****************************************************************");// Separador
		System.out.println("Dias no disfrutados del primer empleado: "+pablo1.diasDisfrutados());
		System.out.println("Dias no disfrutados  del segundo empleado: "+pablo2.diasDisfrutados());
		System.out.println("Dias no disfrutados  del tercero empleado: "+pablo3.diasDisfrutados());
		System.out.println("Dias no disfrutados  del cuarto empleado: "+pablo4.diasDisfrutados());
	}

	private static void testProgramador() {
		System.out.println(Empleado.getNumeroEmpleados());
		Programador pablo = new Programador("Pablo", "producion", "java");
		System.out.println(Empleado.getNumeroEmpleados());
	}// fin test programador

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
	}// fon test empleado

}// fin class fpdual
