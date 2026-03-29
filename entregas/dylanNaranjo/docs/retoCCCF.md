# Documentación - Reto CCCF

## Descripción

RetoCCCF simula un supermercado con 4 cajas (checkouts) de atención al cliente:
- **CCCF**: Cajas de Centro Comercial
- Gestión de colas por caja
- Simulación de atención a clientes
- Conteo de personas por caja

## Características

- 4 cajas operativas con contadores independientes
- Entrada y salida de clientes por caja
- Estados de cada caja (abierta, cerrada)
- Reporte de estado actual del supermercado

## Estructura del código

```
RetoCCCF.java
├─ Variables: cajas[], contadores
├─ Métodos: 
│  ├─ Entrada de cliente
│  ├─ Salida de cliente
│  └─ Reportes
└─ main(): interfaz con usuario
```

## Ejecución

```bash
javac RetoCCCF.java
java RetoCCCF
```

## Variaciones

**RetoCCCFvar.java** ofrece una implementación alternativa con diferente lógica de gestión de colas.

## Conceptos aplicados

- Arrays para gestionar múltiples cajas
- Contadores y acumuladores
- Entrada/salida de datos
- Bucles para procesamiento de transacciones
