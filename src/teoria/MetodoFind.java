package teoria;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Clase de ejemplo que demuestra el uso del método find() dentro de un bucle while.
 * El método find() busca la SIGUIENTE aparición del patrón dentro del texto.
 */
public class MetodoFind {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Ejemplo: Búsqueda de Múltiples Coincidencias con find() ===");
        System.out.println("Ingrese una frase que contenga varios números mezclados:");
        System.out.println("Ejemplo: 'Hoy compre 2 manzanas y 5 peras por 10 pesos.'");
        
        String entrada = scanner.nextLine();
        
        // Explicación del patrón "\\d+" :
        // \\d -> Busca un dígito numérico
        // +   -> Indica 1 o más repeticiones (busca números enteros de cualquier longitud)
        Pattern patron = Pattern.compile("\\d+");
        Matcher buscador = patron.matcher(entrada);
        
        int contador = 0;
        
        System.out.println("\nResultados de la búsqueda:");
        // El bucle while continuará mientras find() devuelva true (encuentre una nueva coincidencia)
        while (buscador.find()) {
            contador++;
            // buscador.group() devuelve el texto específico que coincidió en esta iteración
            System.out.println("Coincidencia #" + contador + " encontrada: " + buscador.group());
        }
        
        if (contador == 0) {
            System.out.println("No se encontraron números en el texto ingresado.");
        } else {
            System.out.println("\nTotal de números encontrados: " + contador);
        }
    }
}
