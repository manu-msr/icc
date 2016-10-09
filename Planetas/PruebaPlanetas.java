/**
 * Clase para hacer pruebas a la enumeración Planeta.
 */
public class PruebaPlanetas {

	/**
	 * Método que regresa la representación en cadena de un planeta.
	 * @param campo Campo a convertir.
	 */
	public static void toString(Enum campo) {
		if (campo instanceof Planeta) { // verificamos que sea instancia
			Planeta planeta = (Planeta)campo; // hacemos el cast
			switch (planeta) { // hacemos switch sobre cualquier posible valor
				case MERCURIO:
					System.out.println("Mercurio");
					break;
				case VENUS:
					System.out.println("Venus");
					break;
				case TIERRA:
					System.out.println("Tierra");
					break;
				case MARTE:
					System.out.println("Marte");
					break;
				case JUPITER:
					System.out.println("Jupiter");
					break;
				case SATURNO:
					System.out.println("Saturno");
					break;
				case URANO:
					System.out.println("Urano");
					break;
				case NEPTUNO:
					System.out.println("Neptuno");
					break;
				case PLUTON:
					System.out.println("Plutón");
					break;
				default: // en caso de recibir un dato inválido.
					System.out.println("Valor incorrecto.");
					break;
			}
		} else // si el parámetro no es de tipo inválido.
			throw new IllegalArgumentException();
	}

	public static void main(String[] args) {
		toString(Planeta.TIERRA); // llamada para la prueba.
	}
}
