package Ejercicio2PabloGM;

import java.lang.Math;
import java.util.Scanner;

public class Painball {
	private int bola;
	private int nivel;
	private int puntos;

	// getters y setters
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	// metodos especificos
	public int selcionaNivel() {
		Scanner teclado = new Scanner(System.in);
		int nivel = 0;
		System.out.println("¿Que nivel desea jugar? ");
		System.out.println("1-Nivel facil(100-500 puntos)");
		// falta desarolar las clasesniveles para/ poder bloquear el acceso
		System.out.println("2-Nivel medio(500-1500 puntos)[Debes superlos 500 puntos en el nivel 1 para desbloquear]");
		System.out.println(
				"3-Nivel ENDEMONIADO(1500-2000 puntos)[Debes superlos 1500 puntos en el nivel 2 para desbloquear]");
		System.out.println("Que nivel desea --> ");
		nivel = teclado.nextInt();
		return nivel;
	}// fin selecionar nivel

	private void juego() {
		int nivel = selcionaNivel();
		if (nivel > 0 && nivel < 3) {
			this.setNivel(nivel);
			;
		} else {
			if (nivel == 0) {
				System.out.println("ENHORA BUENA ERES EL CAMPEON INDISCUTIBLE DEL PINBALL");
			} else {
				System.out.println("no se ha elegido ningun nivel");
			}
		}
	}// fin jugar

}// fin painBall
