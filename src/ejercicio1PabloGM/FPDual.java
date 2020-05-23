package ejercicio1PabloGM;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		testEmpleado();
		

	}
	private void practicaVariable() {
		
	}
	
	private static void testEmpleado() {
		/*
		 * //test Empresa
		System.out.println(Empleado.EMPRESA);
		//test vacaciones
		Empleado paco=new Empleado("Paco");
		System.out.println(paco.getVacaciones());
		paco.vacaciones();
		System.out.println(paco.getVacaciones());
		paco.vacaciones();
		System.out.println(paco.getVacaciones());
		*/
		//test numero de empleados
		System.out.println(Empleado.getNumeroEmpleados());
		for (int i = 0; i < 128 ; i++) {
			Empleado paco=new Empleado("Paco");
			System.out.println(Empleado.getNumeroEmpleados());
		}
	}

}
