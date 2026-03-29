# Entrega - dylanNaranjo (PRG1 22-23)

Colección de ejercicios y retos de Programación I, organizados con el estándar solicitado.

## Navegación

- Código fuente: `src/<reto>/`
- Modelos UML: `modelosUML/`
- Documentación: `docs/`
- Imágenes: `images/`

## Retos incluidos

### Reto ForIf (`src/retoForIf/`)
Ejercicios básicos de bucles y condicionales. Cada archivo contiene un programa independiente.

- **Reto1-21**: Ejercicios de bucles FOR e IF en orden progresivo
- **Reto19var**: Variación alternativa del Reto 19
- Ejecución: `java RetoN` (donde N es el número del reto)

### Reto ASCII (`src/retoASCII/`)
Ejercicios introductorios de impresión y patrones en consola.

### Reto CCCF (`src/retoCCCF/`)
Simulación de colas en supermercado (4 cajas).

- **RetoCCCF.java**: Implementación principal
- **RetoCCCFvar.java**: Variación alternativa
- Ejecución: `java RetoCCCF`

### Reto Vampiro (`src/retoVampiro/`)
Ejercicio de programación orientada a objetos con laberintos temáticos.

- **laberintoVampiro.java**: Versión vampiro
- **laberintoFinal.java**: Versión final completa
- **laberintoGema.java**: Variación con gema
- **laberintoAntorcha.java**: Variación con antorcha
- Ejecución: `java laberintoVampiro` (u otra variación)

### Reto Pacman (`src/RetoPacman/`)
Implementación de juego tipo Pacman.

- Ejecución: `java pacman`

### Reto Aulas (`src/RetoAulas/`)
Sistema de reserva de aulas.

- Ejecución: `java ReservaAulas`

### Reto El Caracol (`src/RetoElCaracol/`)
Ejercicio lógico de caracoles.

- Ejecución: `java RetoElCaracol`

## Ejecución

Ejemplos desde cada carpeta de reto:

```bash
cd src/retoForIf
javac *.java
java Reto1

cd ../retoCCCF
javac *.java
java RetoCCCF

cd ../retoVampiro
javac *.java
java laberintoVampiro
```

## Notas

- Cada reto mantiene sus archivos en su propia carpeta dentro de `src/`.
- Esta estructura evita conflictos entre clases con nombres repetidos en retos distintos.
