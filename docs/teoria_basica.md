# 📚 Teoría Básica de Expresiones Regulares en Java

Este documento describe los componentes esenciales de `java.util.regex`.

## 🧩 Conceptos Fundamentales (RegEx)

Las expresiones regulares son secuencias que describen un patrón de búsqueda textual. 

| Símbolo | Descripción | Ejemplo |
| :--- | :--- | :--- |
| `[abc]` | Busca cualquiera de los caracteres entre corchetes. | `[aeiou]` busca vocales. |
| `\d` | Representa un dígito numérico (0 al 9). Equivale a `[0-9]`. | `\d\d` busca dos dígitos seguidos. |
| `.` (Punto) | Representa cualquier carácter único excepto saltos de línea. | `d.d` puede ser dad, d4d, d.d. |
| `+` | Cuantificador: indica "1 o más veces" de la entidad anterior. | `\d+` busca números de cualquier longitud. |
| `*` | Cuantificador: indica "0 o más veces". | `a*` busca el texto aunque no tenga la letra a. |
| `^` | Indica el inicio de la cadena o línea. | `^Hola` valida si el texto empieza por Hola. |

> **Nota en Java:** El carácter de barra invertida `\` es un carácter de escape en los Strings de Java, por lo tanto para usar `\d` en código se debe escribir como `"\\d"`.

---

## 🔧 La Clase `Pattern`

La clase `Pattern` define la expresión regular que vamos a utilizar. No posee constructor público, se obtiene mediante métodos estáticos.

### 1. `Pattern.compile(String regex)`
Compila la expresión regular para ser utilizada posteriormente.
```java
Pattern p = Pattern.compile("\\d{3}");
```

### 2. `Pattern.compile(String regex, int flags)`
Permite agregar comportamientos especiales a la búsqueda, por ejemplo ignorar si las letras son mayúsculas o minúsculas.
```java
Pattern p = Pattern.compile("hola", Pattern.CASE_INSENSITIVE);
```

---

## 🔍 La Clase `Matcher`

El `Matcher` es el objeto que realmente realiza la comparación contra un texto de entrada utilizando el `Pattern` previamente compilado.

### Métodos Clave

#### `.matches()`
Intenta que **toda la secuencia de entrada** coincida estrictamente con el patrón, de principio a fin. Devuelve `true` o `false`.
Ideal para validación de formularios (ej. ¿es este texto exactamente un correo válido?).

#### `.find()`
Intenta encontrar la **siguiente subsecuencia** del texto de entrada que coincida con el patrón. Se suele usar dentro de un bucle `while` para recorrer un texto largo y sacar múltiples fragmentos que coinciden.

---
[← Volver al Inicio](../README.md)
