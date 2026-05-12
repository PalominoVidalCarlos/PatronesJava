package teoria;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Clase de ejemplo que demuestra el uso de banderas (Flags) en Pattern.compile().
 * Específicamente Pattern.CASE_INSENSITIVE para ignorar mayúsculas/minúsculas.
 */
public class MetodoCaseInsensitive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Ejemplo: Ignorar Mayúsculas y Minúsculas ===");
        System.out.println("Por favor, escribe una oración que contenga la palabra 'java' (ej. Java, JAVA, jAvA):");
        
        String textoEntrada = scanner.nextLine();
        
        // 1. Compilar usando DOS parámetros: (expresiónRegular, bandera)
        // Pattern.CASE_INSENSITIVE habilita la coincidencia sin distinguir mayúsculas.
        Pattern patron = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        
        Matcher buscador = patron.matcher(textoEntrada);
        
        // Verificamos si se encuentra la palabra usando find() con una estructura condicional IF
        if (buscador.find()) {
            System.out.println("✓ Se detectó la palabra: '" + buscador.group() + "'");
            System.out.println("La bandera Pattern.CASE_INSENSITIVE funcionó correctamente.");
        } else {
            System.out.println("✗ No se encontró la palabra 'java' en el texto.");
        }
    }
}
