# Sistema de Control de Calidad de Piezas - Árbol Binario de Búsqueda

Este proyecto implementa un sistema de control de calidad para piezas de producción utilizando un árbol binario de búsqueda (BST). Cada pieza tiene un puntaje de calidad asociado y el sistema permite insertar las piezas en el árbol, realizar recorridos y buscar piezas cuyo puntaje se encuentra dentro de un rango específico.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases principales:

1. **Nodo.java**: Representa un nodo del árbol binario, con un puntaje de calidad y referencias a los nodos izquierdo y derecho.
2. **ArbolBinarioBusqueda.java**: Implementa el árbol binario de búsqueda, con métodos para insertar nodos, realizar recorridos y obtener piezas en un rango específico de puntajes.
3. **Main.java**: Es el punto de entrada del programa. Aquí se crean las piezas, se insertan en el árbol y se realizan los recorridos y búsquedas.

## Funcionalidades

- **Inserción de piezas**: Las piezas se insertan en el árbol binario de búsqueda en función de su puntaje de calidad.
- **Recorridos**:
    - **Preorden**: Visita el nodo raíz, luego el subárbol izquierdo y el subárbol derecho.
    - **Inorden**: Visita el subárbol izquierdo, luego el nodo raíz y finalmente el subárbol derecho.
    - **Postorden**: Visita primero el subárbol izquierdo, luego el subárbol derecho y finalmente el nodo raíz.
- **Búsqueda de piezas en un rango de puntajes**: Permite obtener una lista de piezas cuyo puntaje se encuentra dentro de un rango específico.

## Requisitos

- **Java 8 o superior**.
- **IDE recomendada**: IntelliJ IDEA (aunque cualquier editor de texto que soporte Java debería funcionar).

## Instrucciones de Ejecución

1. **Clonar el repositorio** (si es necesario):

   ```bash
   git clone https://github.com/tu-usuario/control-calidad-piezas.git
