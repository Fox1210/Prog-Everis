package Ejercicio3PabloGM;

import java.util.Scanner;

public class Arrays {
	Arrays(){}
	
	 public void array() {
		String[][] edificio = new String[5][];
		edificio[0] = new String[2]; // 1� planta con 2 casa
		edificio[1] = new String[4]; // 2� planta con 4 casa
		edificio[2] = new String[4]; // 3� planta con 4 casa
		edificio[3] = new String[4]; // 4� planta con 4 casa
		edificio[4] = new String[2]; // 5� planta con 2 casa
		for (int i = 0; i < edificio.length; i++) {
			valores(i);
		}
	}// fin array

	private void valores(int numero) {
		String[] bajos= {"Bajo A: Jes�s"," Bajo B:Joaquin"};
	    String[] planta1={"Puerta A: Alicia","Puerta B: Francisco", "Puerta C: Raul","Puerta D: Samuel"};
	    String[] planta2={"Puerta A: Abraham","Puerta B: Salvador", "Puerta C:Ana Mar�a", "Puerta D: Noelia"};
	    String[] planta3={"Puerta A: Yi","Puerta B: Alicia", "AQUI NO VIVE NADIE", "Puerta D: David"};
	    String[] aticos= {"�tico A: YO ", "�tico B: Fernando Vazquez Boza, \" El se�or de todos los mundanos\""};
	    switch (numero) {
        case 0:
            System.out.println("En el BAJO viven: ");
            for(int i=0;i<bajos.length;i++) {
                System.out.print(bajos[i]+"\t");
            }
            System.out.println();
        break;
        case 1:
            System.out.println("En la 1� PLANTA viven");
            for(int i=0;i<planta1.length;i++) {
                System.out.println(planta1[i]+"\t");
            }
            System.out.println();
            break;
        case 2:
            System.out.println("En la 2� PLANTA viven");
            for(int i=0;i<planta2.length;i++) {
                System.out.println(planta2[i]+"\t");
            }
            System.out.println();
        break;
        case 3:
            System.out.println("En la 3� PLANTA viven");
            for(int i=0;i<planta3.length;i++) {
                System.out.println(planta3[i]+"\t");
            }
            System.out.println();
        break;
        case 4:
            System.out.println("En el �TICO viven");
            for(int i=0;i<aticos.length;i++) {
                System.out.println(aticos[i]+"\t");
            }
            System.out.println();
        break;
        }
    
	}// fin OptenerOcupante()

}// fin clase array