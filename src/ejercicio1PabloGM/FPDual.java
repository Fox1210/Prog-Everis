package ejercicio1PabloGM;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Empleado.EMPRESA);
		Empleado paco=new Empleado("Paco");
		

	}
	private void practicaVariable() {
		
	}
	private void testVacaciones() {
		System.out.println(paco.getVacaciones());
		paco.vacaciones();
		System.out.println(paco.getVacaciones());
		paco.vacaciones();
		System.out.println(paco.getVacaciones());
	}

}
