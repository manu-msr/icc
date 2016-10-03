import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Clase que permite convertir un archivo de texto a su respectiva versión en el
 * lenguaje «Efe».
 */
public class ConvertidorEfe {

	/* Atributo que almacena el contenido del archivo. */
	private String contenido;

	/**
	 * Constructor único de un convertidor.
	 */
	public ConvertidorEfe() {
		contenido = "";
	}

	/**
	 * Método que toma una palabra y la convierte a «Efe».
	 * @param cadena Palabra a convertir.
	 * @return Palabra convertida a «Efe».
	 */
	public String convierte(String palabra) {
		palabra = palabra.replaceAll("a", "afa");
		palabra = palabra.replaceAll("e", "efe");
		palabra = palabra.replaceAll("i", "ifi");
		palabra = palabra.replaceAll("o", "ofo");
		palabra = palabra.replaceAll("u", "ufu");
		return palabra;
	}

	/**
	 * Método que guarda el contenido del archivo.
	 * @param out La salida dónde hay que guardar el contenido.
     * @throws IOException si un error de entrada/salida ocurre.
     */
	public void guarda(BufferedWriter out) throws IOException {
		out.write(convierte(contenido));
	}

	/**
	 * Método que carga el archivo de la entrada recibida.
	 * @param in La entrada dónde hay que cargar el contenido.
	 * @throws IOException si un error de entrada/salida ocurre.
	 */
	public void carga(BufferedReader in) throws IOException {
		String linea = in.readLine();
		while (linea != null) {
			contenido += linea + "\n";
			linea = in.readLine();
		}
	}
}
