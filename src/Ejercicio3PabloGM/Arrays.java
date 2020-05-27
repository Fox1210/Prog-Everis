package Ejercicio3PabloGM;

import java.util.Scanner;

public class Arrays {
	public void llamaArray() {
		array();
	}

	private void array() {

		String[][] edificio = new String[4][];
		edificio[0] = new String[2]; // 1ª planta con 2 casa
		edificio[1] = new String[4]; // 2ª planta con 4 casa
		edificio[2] = new String[4]; // 3ª planta con 4 casa
		edificio[3] = new String[2]; // 4ª planta con 2 casa
		for (int i = 0; i < edificio.length; i++) {
			for (int j = 0; j < edificio[i].length; j++) {
				edificio[i][j] = OptenerOcupante(i, j);
			}
			System.out.println("***************");
		}

	}// fin array

	private String OptenerOcupante(int piso, int puerta) {
		Scanner teclado = new Scanner(System.in);
		String door = letraPuerta(puerta);
		String resultado=null;
		System.out.println("¿Cual es el nombre del residente del apartamento "+piso+"ª."+door+"?");
		System.out.println("Si no vivie nadie introduce un . ");
		resultado=teclado.next();
		if(resultado==".") {
			resultado=null;
		}
		return resultado;
	}// fin OptenerOcupante()

	private String letraPuerta(int puerta) {
		String resultado = null;
		switch (puerta) {
		case 0:
			resultado = "A";
			break;
		case 1:
			resultado = "B";
			break;
		case 2:
			resultado = "C";
			break;
		case 3:
			resultado = "D";
			break;
		}
		return resultado;
	}// fin letraPuerta()

}//fin clase array