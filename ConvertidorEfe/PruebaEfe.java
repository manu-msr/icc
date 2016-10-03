import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/** 
 * Programa que recibe un archivo de texto y confierte el contenido a «EFE».
 */
public class PruebaEfe {

   public static void main(String[] args) {
      /* Creamos el convertidor. */
      ConvertidorEfe cfe = new ConvertidorEfe();
      /* Creamos el objeto para pedir datos del teclado. */
      Scanner teclado = new Scanner(System.in);
      /* Almacenamos el primer argumento de la línea de comandos. */
      String archivo = args[0];
      /* Metemos este código en un bloque try-catch por si hay errores de
         entrada salida. */
      try {
         /* Carga el archivo. */
         FileInputStream fileIn = new FileInputStream(archivo);
         InputStreamReader isIn = new InputStreamReader(fileIn);
         BufferedReader in = new BufferedReader(isIn);
         cfe.carga(in);
         in.close();
         System.out.printf("Archivo %s cargado\n\n", archivo);

         /* Guarda el archivo. */
         System.out.print("Introduce el nombre del archivo de salida: ");
         String salida = teclado.next();
         FileOutputStream fileOut = new FileOutputStream(salida);
         OutputStreamWriter osOut = new OutputStreamWriter(fileOut);
         BufferedWriter out = new BufferedWriter(osOut);
         cfe.guarda(out);
         out.close();
      } catch (IOException ioe) {
         System.exit(1);
      }
   }
}
