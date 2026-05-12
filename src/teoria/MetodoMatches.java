package teoria;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Clase de ejemplo que demuestra el uso del método matches() de java.util.regex.Matcher.
 * El método matches() intenta hacer coincidir TODA la cadena con el patrón establecido.
 */
public class MetodoMatches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Explicación de la expresión regular:
        // \\d representa un dígito numérico en Java (0-9)
        // \\d\\d\\d significa que buscamos exactamente 3 dígitos consecutivos
        String expresionRegular = "\\\\d\\\\d\\\\d";
        
        System.out.println("=== Ejemplo: Validación Completa con matches() ===");
        System.out.println("Ingrese un código de exactamente 3 números (ej. 123): ");
        
        String entrada = scanner.nextLine();
        
        // 1. Compilar el patrón usando un solo parámetro (la expresión regular)
        Pattern patron = Pattern.compile("\\d\\d\\d");
        
        // 2. Crear el Matcher para evaluar la entrada del usuario
        Matcher matcher = patron.matcher(entrada);
        
        // 3. Evaluar si toda la cadena cumple con el patrón
        if (matcher.matches()) {
            System.out.println("✓ Éxito: '" + entrada + "' es un código válido de 3 dígitos.");
        } else {
            System.out.println("✗ Error: '" + entrada + "' no cumple con el formato exacto.");
            System.out.println("Recuerde que matches() requiere coincidencia TOTAL del String.");
        }
        
        // scanner.close(); // Usualmente cerramos el scanner al final de todo el programa
    }
}
