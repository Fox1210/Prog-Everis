/**
 * @author pgomegom
 */
package ejercicio4Pablo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PracticaFicheros {

	private static final String rutaCarpeta = "C:\\Users\\pgomegom\\Desktop\\ficherosPrueba\\";
	private static final String separador = ",";
	private static final String nombreCsv = "listado-elementos.csv";
	private static Map<String, Long> listaElementos = new HashMap<String, Long>();

	public static void main(String[] args) {
		// Rellenamos el HashMap con la lista de ficheros de la carpeta
		cargarLista();

		// genaramos un fichero csv con los valores separados por coma
		generarCsv();

		// leemos el fichero y mostramos por pantalla los elementos
		leerCsv();

	}// fin main

	/**
	 * Metodo que debe recorrer todos los elementos que existan en la carpeta
	 * "rutaCarpeta" y a�adir sus nombres y tamaños (en KB) a la lista
	 * "listaElementos"
	 */
	private static void cargarLista() {
		// TODO Auto-generated method stub
		File carpeta = new File(rutaCarpeta);
		String[] elementos = carpeta.list();

		File f;
		for (String elemento : elementos) {
			f = new File(rutaCarpeta + elemento);
			if (f.isFile()) {
				listaElementos.put(elemento, f.length() / 1024);
			} else {
				listaElementos.put(elemento, f.length() / 1024);
			}
		}
	}// fin carga

	/**
	 * Metodo que genera un fichero csv a partir de los datos existentes en el
	 * HashMap
	 */
	private static void generarCsv() {
		File elementosCsv = new File(rutaCarpeta + nombreCsv);
		try {
			elementosCsv.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// fin genarar

	/**
	 * Metodo que lee el csv y muestra por pantalla el nombre y el tama�o de cada
	 * elemento
	 */
	private static void leerCsv() {
		for (Entry<String, Long> entry : listaElementos.entrySet()) {
			System.out.println(entry.getKey() + separador + " ( " + entry.getValue() + " Kb)");
		}
	}// fin leer

}// fin Class
