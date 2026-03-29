# Documentación - Reto Pacman

## Descripción

Implementación de un juego tipo Pacman en consola:
- El jugador controla una entidad que debe recoger objetivos (pellets)
- Evitar u otros obstáculos/enemigos según la implementación
- Sistema de puntuación
- Detección de victoria/derrota

## Características

- Tablero de juego representado en matriz
- Control del jugador con entrada de teclado
- Lógica de recolección de objetivos
- Sistema de puntos y vidas (posiblemente)
- Condiciones de victoria (recoger todos los pellets o puntos objetivo)
- Condiciones de derrota (colisión con enemigos o límite de vidas alcanzado)

## Estructura base

```
pacman.java
├─ main(): inicialización y game loop
├─ initGame(): crear tablero y posiciones iniciales
├─ display(): renderizar estado actual del juego
├─ input(): leer comandos del jugador
├─ update(): actualizar lógica de juego y enemigos
└─ checkGameState(): evaluar victoria/derrota
```

## Ejecución

```bash
javac pacman.java
java pacman
```

## Mecánicas típicas

- Pacman (jugador): se controla con teclas direccionales
- Pellets: objetivos a recoger para ganar puntos
- Enemigos (fantasmas/otros): patrón de movimiento automático
- Colisión: contacto con enemigo = pérdida de vida o game over

## Concepto educativo

Este reto integra múltiples conceptos:
- Arrays 2D para representar el tablero
- Bucles para el game loop
- Control de entrada y respuesta a acciones
- Lógica de movimiento y colisiones
- Gestión de estado del juego
- Construcción de sistemas complejos desde componentes simples
