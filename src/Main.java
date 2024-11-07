import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        // Insertar las piezas en el árbol según su puntaje
        arbol.insertar(85); // Pieza A
        arbol.insertar(92); // Pieza B
        arbol.insertar(78); // Pieza C
        arbol.insertar(90); // Pieza D
        arbol.insertar(70); // Pieza E
        arbol.insertar(95); // Pieza F
        arbol.insertar(80); // Pieza G

        // Mostrar las piezas con puntajes entre 80 y 90
        List<Integer> piezasEnRango = arbol.obtenerPiezasEnRango(80, 90);
        System.out.println("Piezas con puntajes entre 80 y 90: " + piezasEnRango);

        // Realizar los tres tipos de recorrido
        System.out.print("\nRecorrido Preorden: ");
        arbol.recorridoPreorden();

        System.out.print("\nRecorrido Inorden: ");
        arbol.recorridoInorden();

        System.out.print("\nRecorrido Postorden: ");
        arbol.recorridoPostorden();
    }
}
