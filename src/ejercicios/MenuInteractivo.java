package ejercicios;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Clase que integra menús, bucles do-while y switch, encapsulando 
 * múltiples verificaciones de expresiones regulares dentro del método main.
 */
public class MenuInteractivo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        // Bucle do-while para mantener el programa activo hasta que el usuario decida salir.
        do {
            System.out.println("\n========================================");
            System.out.println("    MENÚ DE EXPRESIONES REGULARES       ");
            System.out.println("========================================");
            System.out.println("1. Validar un correo de prueba básico (ej. user@test.com)");
            System.out.println("2. Buscar todas las vocales en una frase");
            System.out.println("3. Validar si una palabra empieza con la letra 'A' (Case Insensitive)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Control para leer solo números
            if (input.hasNextInt()) {
                opcion = input.nextInt();
                input.nextLine(); // Limpiar el buffer
            } else {
                System.out.println("Error: Debe ingresar un número válido.");
                input.nextLine(); // Limpiar el buffer de la entrada incorrecta
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el correo para validar: ");
                    String correo = input.nextLine();
                    // Patrón simplificado: Texto + @ + Texto + . + Texto
                    // .+ significa 1 o más caracteres de cualquier tipo
                    // \\. escapa el punto literal
                    Pattern patternEmail = Pattern.compile(".+@.+\\..+");
                    Matcher matcherEmail = patternEmail.matcher(correo);
                    
                    if (matcherEmail.matches()) {
                        System.out.println("Resultado: Formato de correo aceptable.");
                    } else {
                        System.out.println("Resultado: Formato NO válido.");
                    }
                    break;

                case 2:
                    System.out.print("\nIngrese un texto para contar las vocales: ");
                    String texto = input.nextLine();
                    // Explicación de [aeiou]: Cualquier carácter contenido en los corchetes
                    Pattern patternVocales = Pattern.compile("[aeiouAEIOU]");
                    Matcher matcherVocales = patternVocales.matcher(texto);
                    
                    int conteo = 0;
                    while (matcherVocales.find()) {
                        conteo++;
                    }
                    System.out.println("Se encontraron " + conteo + " vocales en el texto.");
                    break;

                case 3:
                    System.out.print("\nIngrese una palabra: ");
                    String palabra = input.nextLine();
                    // ^ significa que debe estar al inicio del string.
                    // Usamos Pattern.CASE_INSENSITIVE para cubrir 'A' y 'a'.
                    Pattern patternA = Pattern.compile("^a", Pattern.CASE_INSENSITIVE);
                    Matcher matcherA = patternA.matcher(palabra);
                    
                    // find() busca si empieza con A gracias al metacarácter ^
                    if (matcherA.find()) {
                        System.out.println("La palabra comienza con la letra 'A'.");
                    } else {
                        System.out.println("La palabra NO comienza con la letra 'A'.");
                    }
                    break;

                case 4:
                    System.out.println("\n¡Gracias por usar el programa! Hasta luego.");
                    break;

                default:
                    System.out.println("\nOpción no reconocida, intente nuevamente.");
                    break;
            }

        } while (opcion != 4);

        input.close();
    }
}
