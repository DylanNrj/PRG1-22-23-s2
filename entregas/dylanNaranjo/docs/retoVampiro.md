# Documentación - Reto Vampiro

## Descripción

La serie de retos de laberinto (laberintoVampiro.java, laberintoFinal.java, laberintoGema.java, laberintoAntorcha.java) implementa un sistema de exploración de laberinto con personajes y objetos temáticos:

- **laberintoVampiro.java**: Versión principal con temática vampírica
- **laberintoFinal.java**: Versión completa y refinada
- **laberintoGema.java**: Variante donde el objetivo es encontrar una gema
- **laberintoAntorcha.java**: Variante donde el jugador puede usar una antorcha

## Características principales

- Generación o carga de laberinto en matriz
- Movimiento del personaje (W, A, S, D)
- Detección de colisiones con paredes
- Objetivos (vampiro, gema, antorcha)
- Sistemas de iluminación o visibilidad (antorcha)
- Estadísticas de exploración

## Estructura típica

```
laberintoX.java
├─ main(): punto de entrada
├─ initLaberininto(): crear/cargar mapa
├─ display(): mostrar estado actual
├─ move(): procesar input del usuario
└─ checkVictoria(): evaluar condición ganadora
```

## Ejecución

```bash
javac laberintoVampiro.java
java laberintoVampiro
```

## Controles (típicamente)

- `W`: Mover arriba
- `A`: Mover izquierda
- `S`: Mover abajo
- `D`: Mover derecha
- `Q`: Salir

## Variaciones

Cada archivo implementa el mismo concepto de laberinto pero con temáticas diferentes y posibles diferencias mecánicas (gema busca coleccionables, antorcha añade iluminación limitada).

## Concepto educativo

Estos retos introducen:
- Arrays 2D para representar espacios
- Algoritmos de búsqueda (encuentra el objeto)
- Manejo de entrada de usuario
- Lógica de colisiones
- Bucles de game loop
