# ☕ Aprendiendo Java: Pattern y Matcher Básicos

¡Bienvenido a este repositorio educativo! Aquí encontrarás todo lo necesario para dar tus primeros pasos trabajando con **Expresiones Regulares (RegEx)** en Java, utilizando las clases del paquete `java.util.regex`.

## 📖 Tabla de Contenidos
- [🚀 Introducción](#-introducción)
- [📘 Guía Teórica](#-guía-teórica)
- [💻 Ejemplos de Código](#-ejemplos-de-código)
- [🛠️ Estructura del Proyecto](#️-estructura-del-proyecto)
- [📊 Material de Apoyo (NotebookLM)](#-material-de-apoyo-notebooklm)

---

## 🚀 Introducción
Este repositorio está diseñado para entender los métodos básicos y esenciales:
- `Pattern.compile("expresion")`
- `Pattern.compile("expresion", Pattern.CASE_INSENSITIVE)`
- `Matcher.matches()` para validación exacta.
- `Matcher.find()` para búsquedas iterativas.

## 📘 Guía Teórica
Para ver la síntesis teórica de los símbolos, operadores básicos y las clases de Java, visita nuestra guía:

🔗 **[Leer Guía de Teoría Básica](./docs/teoria_basica.md)**

## 💻 Ejemplos de Código
Todo el código de este repositorio se ejecuta directamente desde el método `main` e incluye un uso intensivo de `Scanner` para que puedas probarlo interactivamente.

### Sección Teórica (`src/teoria/`)
1. **[MetodoMatches.java](./src/teoria/MetodoMatches.java)**: Aprende a validar entradas estrictas de 3 dígitos.
2. **[MetodoFind.java](./src/teoria/MetodoFind.java)**: Encuentra números perdidos dentro de un párrafo de texto usando un bucle `while`.
3. **[MetodoCaseInsensitive.java](./src/teoria/MetodoCaseInsensitive.java)**: Encuentra una palabra clave sin importar si la escribes en mayúsculas o minúsculas.

### Ejercicios Completos (`src/ejercicios/`)
- **[MenuInteractivo.java](./src/ejercicios/MenuInteractivo.java)**: Un mini programa interactivo que incluye validación de correos básicos y conteo de vocales usando `switch` y `do-while`.

---

## 🛠️ Estructura del Proyecto
Este repositorio respeta la estructura estándar de **Apache NetBeans IDE**, permitiéndote abrirlo directamente:
```text
📂 PatronesJava/
├── 📁 src/                  # Archivos fuente (.java)
│   ├── 📁 teoria/           # Código enfocado a conceptos unitarios
│   └── 📁 ejercicios/       # Código con menús e interactividad
├── 📁 docs/                 # Documentación en markdown
├── 📁 nbproject/            # Configuraciones de NetBeans
├── 📄 build.xml             # Script de construcción Ant
└── 📄 README.md             # Este archivo
```

---
